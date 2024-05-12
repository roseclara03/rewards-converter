public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert cash value to miles.
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert miles value to cash.
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    // Method to convert from cash to miles.
    public static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Method to convert from miles to cash.
    public static double convertMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}
