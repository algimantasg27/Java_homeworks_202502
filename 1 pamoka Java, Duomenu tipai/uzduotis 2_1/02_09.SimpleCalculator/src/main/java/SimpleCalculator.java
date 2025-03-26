
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int inputFirst = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int inputSecond = Integer.valueOf(scanner.nextLine());
        scanner.close();

        System.out.println(inputFirst + " + " + inputSecond + " = " + (inputFirst + inputSecond));
        System.out.println(inputFirst + " - " + inputSecond + " = " + (inputFirst - inputSecond));
        System.out.println(inputFirst + " * " + inputSecond + " = " + (inputFirst * inputSecond));
        System.out.println(inputFirst + " / " + inputSecond + " = " + (inputFirst * 1.0 / inputSecond));
    }
}
