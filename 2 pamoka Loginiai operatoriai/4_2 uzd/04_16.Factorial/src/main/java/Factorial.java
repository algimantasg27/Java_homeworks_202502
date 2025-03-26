
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int inputNumber = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int factorialSum = 1;

        if (inputNumber != 0) {
            for (int i = 2; i <= inputNumber ; i++) {
                factorialSum *= i;
            }
        } else {factorialSum = 1;}


        System.out.println("Factorial: " + factorialSum);
    }
}
