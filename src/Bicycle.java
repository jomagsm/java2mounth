public class Bicycle extends Transport implements Printable {
    private int numberOfWheels;
    private String ownerName;

    public Bicycle(String name, int numberOfWheels, String ownerName) {
        super(name);
        this.numberOfWheels = numberOfWheels;
        this.ownerName = ownerName;
    }

    public void print() {
        System.out.println("🚲 Number of wheels: " + this.numberOfWheels
                + " Owner name: " + this.ownerName);
    }
}
