
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        PaymentCard cardPauls = new PaymentCard(20);
        PaymentCard cardMatts = new PaymentCard(30);

        cardPauls.eatHeartily();
        cardMatts.eatAffordably();

        System.out.println("Paul: " + cardPauls);
        System.out.println("Matt: " + cardMatts);

        cardPauls.addMoney(20);
        cardMatts.eatHeartily();

        System.out.println("Paul: " + cardPauls);
        System.out.println("Matt: " + cardMatts);

        cardPauls.eatAffordably();
        cardPauls.eatAffordably();
        cardMatts.addMoney(50);

        System.out.println("Paul: " + cardPauls);
        System.out.println("Matt: " + cardMatts);
    }
}
