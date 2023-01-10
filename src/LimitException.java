public class LimitException extends Exception {
    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    private Double remainingAmount;

    public Double getRemainingAmount() {
        return remainingAmount;
    }

}
