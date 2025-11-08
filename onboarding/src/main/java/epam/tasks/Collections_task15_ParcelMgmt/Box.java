package epam.tasks.Collections_task15_ParcelMgmt;

public class Box {

	public static int counter = 0;
	public int id;
	public String sender;
	public String recipient;
	public double weight;
	public double volume;
	public double cost;
	public String city;
	public String office;

    public Box(String sender, String recipient, double weight, double volume, double cost, String city, String office) {
        this.id = ++counter;
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.volume = volume;
        this.cost = cost;
        this.city = city;
        this.office = office;
    }

    public int getId() { return id; }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public double getWeight() { return weight; }
    public double getVolume() { return volume; }
    public double getCost() { return cost; }
    public String getCity() { return city; }
    public String getOffice() { return office; }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", cost=" + cost +
                ", city='" + city + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
