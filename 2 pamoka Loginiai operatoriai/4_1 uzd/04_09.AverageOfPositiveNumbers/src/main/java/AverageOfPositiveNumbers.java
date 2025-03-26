
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                System.out.println(average);
                break;
            }
            else if (number < 0) {
                continue;
            }
            sum += number;
            count++;
            average = (double) sum /count;
        }
    }
}
