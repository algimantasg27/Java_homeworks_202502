
public class Main {

    public static void main(String[] args) {

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("amount of money on the card is  " + annesCard.balance() + " euros");

        boolean wasSuccessfull = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessfull);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessfull = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessfull);

        System.out.println("amount of money on the card is  " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
        //--------------------
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        PaymentCard annesCard = new PaymentCard(7);
//
//        boolean wasSuccessfull = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessfull);
//        wasSuccessfull = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessfull);
//        wasSuccessfull = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccessfull);
//
//        System.out.println(unicafeExactum);

        //-------------------
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);

        //------------------------
//        PaymentCard petesCard = new PaymentCard(10);
//        System.out.println("money: " + petesCard.balance());
//        boolean wasSuccessfull = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessfull);
//        System.out.println("money: " + petesCard.balance());
//
//        wasSuccessfull = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessfull);
//        System.out.println("money: " + petesCard.balance());

    }
}

