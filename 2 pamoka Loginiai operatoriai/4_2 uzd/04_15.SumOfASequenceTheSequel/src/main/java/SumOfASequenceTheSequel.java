
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int inputFirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int inputLastNumber = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int sum = 0;

        for (int i = inputFirstNumber; i <= inputLastNumber ; i++) {
                sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}
