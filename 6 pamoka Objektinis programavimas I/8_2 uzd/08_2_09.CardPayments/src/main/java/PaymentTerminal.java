
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {

        if (payment >= 2.50) {
            affordableMeals++;
            money += 2.50;
            return payment - 2.50;
        } else {return 0.0;}
    }

    public double eatHeartily(double payment) {

        if (payment >= 4.30) {
            heartyMeals++;
            money += 4.30;
            return payment - 4.30;
        } else {return 0.0;}
    }

    public boolean eatAffordably(PaymentCard cash) {
        if (cash.balance() >= 2.50) {
            cash.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {return false;}
    }

    public boolean eatHeartily(PaymentCard cash) {
        if (cash.balance() >= 4.30) {
            cash.takeMoney(4.30);
            heartyMeals++;
            return true;
        } else {return false;}
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
