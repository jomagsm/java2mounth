public class BankAccount {
    private double amount;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double sum) {
        this.amount = +sum;
    }

    public void withDraw(Integer sum) throws LimitException {
        Double remainder = this.amount - sum;
        if (remainder < 0) {
            throw new LimitException("There are not enough funds in the account to fulfill the operation", this.amount);
        }
        this.amount = remainder;
        System.out.println(
                "You withdrew from the account " + sum + " som Your current balance is: " + this.amount + " som");
    }
}
