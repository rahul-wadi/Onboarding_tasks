package epam.tasks.Collections_task10_Shop;

import java.util.*;

public class CashBox {

	public enum State { ENABLED, IS_CLOSING, DISABLED }

    private final int number;
    private State state;
    private final Deque<Buyer> queue;

    public CashBox(int number) {
        this.number = number;
        this.state = State.DISABLED;
        this.queue = new ArrayDeque<>();
    }
    
    public Deque<Buyer> getQueue() {
        return new ArrayDeque<>(queue);
    }
    
    public Buyer serveBuyer() {
        if (queue.isEmpty()) return null;
        Buyer b = queue.pollFirst();
        if (state == State.IS_CLOSING && queue.isEmpty()) {
            state = State.DISABLED;
        }
        return b;
    }

    public boolean inState(State s) {
        return this.state == s;
    }

    public boolean notInState(State s) {
        return this.state != s;
    }

    public void addLast(Buyer buyer) {
        queue.addLast(buyer);
    }

    public Buyer removeLast() {
        return queue.isEmpty() ? null : queue.removeLast();
    }

    public int size() {
        return queue.size();
    }

    public int getNumber() {
        return number;
    }

    public State getState() {
        return state;
    }

    public void setState(State newState) {
        this.state = newState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(number);
        if (state == State.ENABLED) sb.append("[+] ");
        else if (state == State.IS_CLOSING) sb.append("[|] ");
        else sb.append("[-] ");
        int i = 0;
        for (Buyer b : queue) {
            if (i++ > 0) {  }
            sb.append(b.toString());
        }
        return sb.toString();
    }
}
