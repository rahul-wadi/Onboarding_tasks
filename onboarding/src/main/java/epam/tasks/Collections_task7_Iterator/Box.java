package epam.tasks.Collections_task7_Iterator;

import java.math.*;

public class Box {

	public String sender;
	public String recipient;
    public double weight;
    public double volume;
    public int value;
    public BigDecimal cost;

    public Box(String sender, String recipient, double weight, double volume, int value) {
        if (sender == null || sender.isEmpty() || recipient == null || recipient.isEmpty()) {
            throw new IllegalArgumentException("Sender and recipient must be specified.");
        }
        if (weight < 0.5 || weight > 20.0) {
            throw new IllegalArgumentException("Weight must be between 0.5 and 20.0 kg.");
        }
        if (volume <= 0 || volume >= 0.25) {
            throw new IllegalArgumentException("Volume must be greater than 0 and less than 0.25 m³.");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }

        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.volume = volume;
        this.value = value;
    }

    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public double getWeight() { return weight; }
    public double getVolume() { return volume; }
    public int getValue() { return value; }
    public BigDecimal getCost() { return cost; }

    public void setCost(BigDecimal cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "Box{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", value=" + value +
                ", cost=" + cost +
                '}';
    }
}
