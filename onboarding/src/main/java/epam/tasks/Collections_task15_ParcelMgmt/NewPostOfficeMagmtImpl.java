package epam.tasks.Collections_task15_ParcelMgmt;

import java.util.*;

public class NewPostOfficeMagmtImpl implements NewPostOfficeManagement {

	public List<Box> boxes;

    public NewPostOfficeMagmtImpl(List<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public Optional<Box> getBoxById(int id) {
        // Sort by ID before binary search
        Collections.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });

        // Use binarySearch
        int index = Collections.binarySearch(boxes, new Box("", "", 0, 0, 0, "", "") {
        }, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return Integer.compare(o1.getId(), id);
            }
        });

        if (index >= 0) {
            return Optional.of(boxes.get(index));
        }
        return Optional.empty();
    }

    @Override
    public String getDescSortedBoxesByWeight() {
        List<Box> sorted = new ArrayList<Box>(boxes);
        Collections.sort(sorted, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sorted.size(); i++) {
            sb.append(sorted.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String getAscSortedBoxesByCost() {
        List<Box> sorted = new ArrayList<Box>(boxes);
        Collections.sort(sorted, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return Double.compare(o1.getCost(), o2.getCost());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sorted.size(); i++) {
            sb.append(sorted.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public List<Box> getBoxesByRecipient(String recipient) {
        if (recipient == null) {
            throw new NullPointerException("Recipient cannot be null");
        }

        // Sort by recipient
        Collections.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getRecipient().compareTo(o2.getRecipient());
            }
        });

        // Find first occurrence using binary search
        int index = Collections.binarySearch(boxes, new Box("", recipient, 0, 0, 0, "", "") {
        }, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getRecipient().compareTo(o2.getRecipient());
            }
        });

        if (index < 0) {
            return new ArrayList<Box>();
        }

        // Collect all boxes with that recipient
        List<Box> result = new ArrayList<Box>();
        int left = index;
        while (left >= 0 && boxes.get(left).getRecipient().equals(recipient)) {
            left--;
        }
        left++;

        int right = index;
        while (right < boxes.size() && boxes.get(right).getRecipient().equals(recipient)) {
            right++;
        }

        for (int i = left; i < right; i++) {
            result.add(boxes.get(i));
        }

        return result;
    }
}
