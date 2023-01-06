public class Plane extends Transport implements Printable {
    private int maxFlightRange;
    private String planeType;

    public Plane(String name, int maxFlightRange, String planeType) {
        super(name);
        this.maxFlightRange = maxFlightRange;
        this.planeType = planeType;
    }

    @Override
    public void print() {
        System.out.println("🛩 Plane type: " + this.planeType
                + " Maximum flight range : " + this.maxFlightRange);
    }

}
