
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int inputFirst = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int inputSecond = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int inputThird = Integer.valueOf(scanner.nextLine());
        scanner.close();

        System.out.println("The average is " + (inputFirst + inputSecond + inputThird) / 3.0);
    }
}
