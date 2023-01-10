import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                final String separator = "==========+++==========";
                User user = new User();
                Scanner scanner = new Scanner(System.in);
                while (true) {
                        try {
                                System.out.println("Enter user name: ");
                                user.setName(scanner.next());
                        } catch (IllegalNameLengthException e) {
                                System.out.println(e.getMessage());
                        }
                        try {
                                System.out.println("Enter user age: ");
                                user.setAge(scanner.nextInt());
                        } catch (Exception e) {
                                System.out.println(e.getMessage());
                        }
                        if (user.getName() != null && user.getAge() != null) {
                                break;
                        }
                }

        }
}
