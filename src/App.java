
public class App {
        public static void main(String[] args) throws Exception {
                final String separator = "==========+++==========";
                BankAccount bankAccount = new BankAccount();
                bankAccount.deposit(20000.00);
                while (true) {
                        System.out.println(separator);
                        try {
                                bankAccount.withDraw(6000);
                        } catch (LimitException e) {
                                try {
                                        System.out.println(e.getMessage());
                                        bankAccount.withDraw(e.getRemainingAmount().intValue());
                                } catch (LimitException j) {
                                        System.out.println(j.getMessage());
                                }
                                break;
                        }
                }
        }
}
