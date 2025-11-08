package epam.tasks.Collections_task10_Shop;

import java.util.*;

public class Shop {

	private final List<CashBox> boxes;

    public Shop(int n) {
        boxes = new ArrayList<>(n);
        for (int i = 0; i < n; i++) boxes.add(new CashBox(i));
    }

    public void print() {
        for (CashBox cb : boxes) {
            System.out.println(cb.toString());
        }
    }
    
    public void addBuyer(Buyer buyer) {
        CashBox best = null;
        int bestSize = Integer.MAX_VALUE;
        for (CashBox cb : boxes) {
            if (cb.inState(CashBox.State.ENABLED)) {
                int s = cb.size();
                if (s < bestSize) {
                    bestSize = s;
                    best = cb;
                }
            }
        }
        if (best != null) {
            best.addLast(buyer);
        }
    }

    public CashBox getCashBox(int cboxNumber) {
        if (cboxNumber < 0 || cboxNumber >= boxes.size()) return null;
        return boxes.get(cboxNumber);
    }
    
    public void setCashBoxState(int cboxNumber, CashBox.State state) {
        CashBox cb = getCashBox(cboxNumber);
        if (cb == null) return;
        CashBox.State old = cb.getState();
        if (old == state) return;
        cb.setState(state);
        if (old == CashBox.State.DISABLED && state == CashBox.State.ENABLED) {
            balance();
        } else {
            balance();
        }
    }
    
    public void tact() {
        for (CashBox cb : boxes) {
            cb.serveBuyer();
        }
        balance();
    }
    
    private void balance() {
        List<Integer> enabledIndices = new ArrayList<>();
        for (int i = 0; i < boxes.size(); i++) {
            if (boxes.get(i).inState(CashBox.State.ENABLED)) enabledIndices.add(i);
        }
        int R = enabledIndices.size();
        if (R == 0) {
            return;
        }

        int totalBuyers = 0;
        for (CashBox cb : boxes) totalBuyers += cb.size();

        int base = totalBuyers / R;
        int extra = totalBuyers % R;

        int[] targetForEnabled = new int[R];
        for (int i = 0; i < R; i++) {
            targetForEnabled[i] = base + (i < extra ? 1 : 0);
        }

        int[] needForEnabled = new int[R];
        int totalNeed = 0;
        for (int i = 0; i < R; i++) {
            CashBox cb = boxes.get(enabledIndices.get(i));
            int cur = cb.size();
            int need = Math.max(0, targetForEnabled[i] - cur);
            needForEnabled[i] = need;
            totalNeed += need;
        }

        Deque<Buyer> defector = new ArrayDeque<>();

        int remainingNeed = totalNeed;
        for (int i = 0; i < R && remainingNeed > 0; i++) {
            CashBox cb = boxes.get(enabledIndices.get(i));
            int cur = cb.size();
            int surplus = Math.max(0, cur - targetForEnabled[i]); // how many should leave this enabled box
            int take = Math.min(surplus, remainingNeed);
            for (int t = 0; t < take; t++) {
                Buyer moved = cb.removeLast();
                if (moved != null) defector.addLast(moved);
            }
            remainingNeed -= take;
        }
        
        if (remainingNeed > 0) {
            for (CashBox cb : boxes) {
                if (remainingNeed <= 0) break;
                if (cb.inState(CashBox.State.IS_CLOSING)) {
                    while (remainingNeed > 0 && cb.size() > 0) {
                        Buyer moved = cb.removeLast();
                        if (moved != null) {
                            defector.addLast(moved);
                            remainingNeed--;
                        } else break;
                    }
                }
            }
        }
        
        if (remainingNeed > 0) {
            for (CashBox cb : boxes) {
                if (remainingNeed <= 0) break;
                while (remainingNeed > 0 && cb.size() > 0) {
                    Buyer moved = cb.removeLast();
                    if (moved != null) {
                        defector.addLast(moved);
                        remainingNeed--;
                    } else break;
                }
            }
        }
        
        for (int i = 0; i < R; i++) {
            CashBox cb = boxes.get(enabledIndices.get(i));
            int need = needForEnabled[i];
            for (int k = 0; k < need; k++) {
                if (defector.isEmpty()) break;
                Buyer moved = defector.pollFirst();
                if (moved != null) cb.addLast(moved);
            }
        }

        if (!defector.isEmpty() && !enabledIndices.isEmpty()) {
            CashBox last = boxes.get(enabledIndices.get(enabledIndices.size() - 1));
            while (!defector.isEmpty()) {
                last.addLast(defector.pollFirst());
            }
        }
    }       
}

		