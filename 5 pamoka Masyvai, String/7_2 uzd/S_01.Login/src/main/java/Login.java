
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter password: ");
        String passWord = scanner.nextLine();

        if (userName.equals("alex") && passWord.equals("sunshine") ||
                userName.equals("emma") && passWord.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {System.out.println("Incorrect username or password!");}
    }
}
