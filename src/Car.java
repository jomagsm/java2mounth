public class Car extends Transport implements Printable {
    private String model;
    private String manufacturer;
    private int volume;

    public Car(String name, String model, String manufacturer, int volume) {
        super(name);
        this.model = model;
        this.manufacturer = manufacturer;
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("🚗 MODEL: " + this.model
                + " MANUFACTURER: " + this.manufacturer
                + " VOLUME" + this.volume);
    }

}
