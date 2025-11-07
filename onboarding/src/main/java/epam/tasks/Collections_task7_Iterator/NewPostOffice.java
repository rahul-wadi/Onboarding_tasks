package epam.tasks.Collections_task7_Iterator;

import java.math.*;
import java.util.*;

public class NewPostOffice {

	private Collection<Box> listBox;

    public NewPostOffice() {
        listBox = new ArrayList<>();
    }

    public Collection<Box> getListBox() {
        return listBox;
    }

    // Constants for cost calculation
    private static final BigDecimal COST_PER_KG = new BigDecimal("10.00");
    private static final BigDecimal COST_PER_M3 = new BigDecimal("500.00");
    private static final BigDecimal VALUE_COEFFICIENT = new BigDecimal("0.05");

    public static BigDecimal calculateCostOfBox(double weight, double volume, int value) {
        BigDecimal weightCost = COST_PER_KG.multiply(BigDecimal.valueOf(weight));
        BigDecimal volumeCost = COST_PER_M3.multiply(BigDecimal.valueOf(volume));
        BigDecimal valueCost = VALUE_COEFFICIENT.multiply(BigDecimal.valueOf(value));

        return weightCost.add(volumeCost).add(valueCost);
    }

    public boolean addBox(String sender, String recipient, double weight, double volume, int value) {
        try {
            Box box = new Box(sender, recipient, weight, volume, value);
            BigDecimal cost = calculateCostOfBox(weight, volume, value);
            box.setCost(cost);
            return listBox.add(box);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Collection<Box> deliveryBoxToRecipient(String recipient) {
        Collection<Box> delivered = new ArrayList<>();
        Iterator<Box> iterator = listBox.iterator();

        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getRecipient().equalsIgnoreCase(recipient)) {
                delivered.add(box);
                iterator.remove();
            }
        }
        return delivered;
    }

    public void declineCostOfBox(double percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Percent must be non-negative.");
        }

        Iterator<Box> iterator = listBox.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            BigDecimal discountFactor = BigDecimal.ONE.subtract(BigDecimal.valueOf(percent / 100.0));
            BigDecimal newCost = box.getCost().multiply(discountFactor);
            box.setCost(newCost);
        }
    }
}
