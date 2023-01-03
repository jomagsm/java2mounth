public class Engine {

    public Engine(int volume, TypeOfMotorEnum typeOfMotor) {
        this.volume = volume;
        this.typeOfMotor = typeOfMotor;
    }

    private int volume;
    private TypeOfMotorEnum typeOfMotor;

    public int getVolume() {
        return volume;
    }

    public TypeOfMotorEnum getTypeOfMotor() {
        return typeOfMotor;
    }

    public String getInfo() {
        return (this.typeOfMotor == TypeOfMotorEnum.ELECTRIC ? "" : "Volume: " + volume)
                + "\nType of motor: " + typeOfMotor;
    }
}
