
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int numb = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("You gave the number " + numb);
    }
}
