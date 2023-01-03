public class Car extends LandTransport {
    public Car(int mileage, String model, TypeOfCarEnum type,
            int doors, CarManufacturer manufacturer,
            Engine engine) {
        super(mileage);
        this.model = model;
        this.type = type;
        this.doors = doors;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    private String model;
    private TypeOfCarEnum type;
    private int doors;
    private CarManufacturer manufacturer;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public TypeOfCarEnum getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void beepSound() {
        System.out.println("Beeeeeep");
    }

    public void beepSound(String customSignal) {
        System.out.println(customSignal);
    }

    final void theSoundOfTheEngine() {
        switch (this.engine.getTypeOfMotor()) {
            case DIESEL:
                System.out.println("Pr Pr Pr Pr");
                break;
            case ELECTRIC:
                System.out.println("");
                break;
            default:
                System.out.println("Brrrr");
                break;
        }
    }

    final void theSoundOfTheEngine(String custom) {
        System.out.println(custom);
    }

    public String getInfo() {
        return "Model: " + this.model
                + "\n" + this.manufacturer.getInfo()
                + "\nMilage: " + this.getMileage()
                + "\nType of Car: " + this.type
                + "\nHow much is the door: " + this.doors
                + "\nEngine: " + this.engine.getInfo();
    }

}
