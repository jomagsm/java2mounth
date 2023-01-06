public class App {
        public static void main(String[] args) throws Exception {
                final String temp = "==========+++==========";
                Transport[] transports = { createObject(TransportTypeEnum.AIRPLANE),
                                createObject(TransportTypeEnum.BICYCLE),
                                createObject(TransportTypeEnum.CAR),
                };
                for (int i = 0; i < transports.length; i++) {
                        if (transports[i] instanceof Printable) {
                                ((Printable) transports[i]).print();
                                System.out.println(temp);
                        }
                }
        }

        public static Transport createObject(TransportTypeEnum transportType) {
                switch (transportType) {
                        case BICYCLE:
                                return new Bicycle("Bicycle", 2, "Yan");
                        case CAR:
                                return new Car("CAR", "ES300h", "Lexus", 2499);
                        case AIRPLANE:
                                return new Plane("JET", 2500, "Airplane");
                        default:
                                return new Car("CAR", "ES300h", "Lexus", 2499);
                }
        }
}
