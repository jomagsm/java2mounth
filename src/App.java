public class App {
    public static void main(String[] args) throws Exception {
        final String temp = "==========+++==========";
        final CarManufacturer kia = new CarManufacturer("KIA", "South Korea");
        final CarManufacturer lexus = new CarManufacturer("Lexus", "Japan");
        final CarManufacturer toyota = new CarManufacturer("Toyota", "Japan");
        final Engine toyotaLexus25 = new Engine(2499, TypeOfMotorEnum.HYBRID);
        final Engine morning1 = new Engine(999, TypeOfMotorEnum.GAS);
        final Engine kiaK5 = new Engine(1999, TypeOfMotorEnum.GAS);

        Car lexusEs = new Car(70000, "ES300h", TypeOfCarEnum.SEDAN, 5, lexus, toyotaLexus25);
        System.out.println(lexusEs.getInfo());
        lexusEs.beepSound();
        lexusEs.beepSound("BiiiiiBiiiiP");
        lexusEs.theSoundOfTheEngine();
        lexusEs.theSoundOfTheEngine("UUUUUUU");
        System.out.println(temp);

        Car kiaMorning = new Car(170000, "Morning", TypeOfCarEnum.HATCHBACK, 5,
                kia, morning1);
        System.out.println(kiaMorning.getInfo());
        kiaMorning.beepSound();
        kiaMorning.beepSound("BiiiiiBiiiiP");
        kiaMorning.theSoundOfTheEngine();
        kiaMorning.theSoundOfTheEngine("UUUUUUU");
        System.out.println(temp);

        CarForSale camryInSale = new CarForSale(65000, "Camry 70", TypeOfCarEnum.SEDAN, 5, toyota, toyotaLexus25, 25000,
                30000);
        System.out.println(camryInSale.getInfo());
        camryInSale.beepSound();
        camryInSale.beepSound("BiiiiiBiiiiP");
        camryInSale.theSoundOfTheEngine();
        camryInSale.theSoundOfTheEngine("UUUUUUU");
        System.out.println(temp);

        CarForSale k5InSale = new CarForSale(150000, "K5", TypeOfCarEnum.SEDAN, 5, kia, kiaK5, 12000,
                14500);
        System.out.println(k5InSale.getInfo());
        k5InSale.beepSound();
        k5InSale.beepSound("BiiiiiBiiiiP");
        k5InSale.theSoundOfTheEngine();
        k5InSale.theSoundOfTheEngine("UUUUUUU");
        System.out.println(temp);
    }
}
