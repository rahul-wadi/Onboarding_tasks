package epam.tasks.Collections_task9_NewPost;

import java.math.*;
import java.util.*;
import java.util.function.*;


public class NewPostOfficeStorageImpl implements NewPostOfficeStorage {

	private final List<Box> storage = new ArrayList<>();

    @Override
    public boolean acceptBox(Box box) {
        if (box == null) {
            throw new NullPointerException("Box cannot be null");
        }
        return storage.add(box);
    }

    @Override
    public boolean acceptAllBoxes(Collection<Box> boxes) {
        if (boxes == null) {
            throw new NullPointerException("Collection cannot be null");
        }
        for (Box b : boxes) {
            if (b == null) {
                throw new NullPointerException("Box collection contains null element");
            }
        }

        try {
            return storage.addAll(boxes);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean carryOutBoxes(Collection<Box> boxes) {
        if (boxes == null) {
            throw new NullPointerException("Collection cannot be null");
        }

        boolean changed = false;
        Iterator<Box> iterator = storage.iterator();
        while (iterator.hasNext()) {
            Box b = iterator.next();
            for (Box bx : boxes) {
                if (b == bx) { // Identity check, since Box has no unique field
                    iterator.remove();
                    changed = true;
                    break;
                }
            }
        }
        return changed;
    }

    @Override
    public List<Box> carryOutBoxes(Predicate<Box> predicate) {
        if (predicate == null) {
            throw new NullPointerException("Predicate cannot be null");
        }

        List<Box> removed = new ArrayList<>();
        Iterator<Box> iterator = storage.iterator();
        while (iterator.hasNext()) {
            Box b = iterator.next();
            if (predicate.test(b)) {
                removed.add(b);
                iterator.remove();
            }
        }
        return removed;
    }

    @Override
    public List<Box> getAllWeightLessThan(double weight) {
        List<Box> result = new ArrayList<>();
        for (Box b : storage) {
            if (b.getWeight() < weight) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Box> getAllCostGreaterThan(BigDecimal cost) {
        if (cost == null) {
            throw new NullPointerException("Cost cannot be null");
        }

        List<Box> result = new ArrayList<>();
        for (Box b : storage) {
            if (b.getCost().compareTo(cost) > 0) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Box> getAllVolumeGreaterOrEqual(double volume) {
        List<Box> result = new ArrayList<>();
        for (Box b : storage) {
            if (b.getVolume() >= volume) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Box> searchBoxes(Predicate<Box> predicate) {
        if (predicate == null) {
            throw new NullPointerException("Predicate cannot be null");
        }

        List<Box> result = new ArrayList<>();
        for (Box b : storage) {
            if (predicate.test(b)) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public void updateOfficeNumber(Predicate<Box> predicate, int newOfficeNumber) {
        if (predicate == null) {
            throw new NullPointerException("Predicate cannot be null");
        }

        for (Box b : storage) {
            if (predicate.test(b)) {
                b.setOffice(newOfficeNumber);
            }
        }
    }
}
