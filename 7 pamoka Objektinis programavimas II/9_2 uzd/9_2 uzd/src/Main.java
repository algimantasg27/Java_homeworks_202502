public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account(1122, 20000.00, 4.5);

        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        System.out.println(myAccount);

    }
}