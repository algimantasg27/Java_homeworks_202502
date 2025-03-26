public class Debt {
    private double balance;
    private double interestRate;
    private int count;

    public Debt(double initialbalance, double initialInterestRate)  {
        this.balance = initialbalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);

    }

    public void waitOneYear() {

        if (count <= 20) {
            balance = balance * interestRate;
        } else {
            interestRate = 1.20;
            balance = balance * interestRate;
        }

        count++;
    }
}
