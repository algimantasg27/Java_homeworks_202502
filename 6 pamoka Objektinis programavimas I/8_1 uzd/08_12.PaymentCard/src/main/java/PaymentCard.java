public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount >= 0) {
            balance += amount;
            balance = (balance >= 150) ? 150 : balance;
        }
    }

    @Override
    public String toString() {
    return   "The card has a balance of " + balance + " euros";
    }
}
