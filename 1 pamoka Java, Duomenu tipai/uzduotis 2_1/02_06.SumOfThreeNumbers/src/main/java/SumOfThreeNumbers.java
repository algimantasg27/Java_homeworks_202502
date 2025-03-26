
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int inputFirst = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int inputSecond = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int inputThird = Integer.valueOf(scanner.nextLine());
        scanner.close();

        System.out.println("The sum of the numbers is " + (inputFirst + inputSecond + inputThird));
    }
}
