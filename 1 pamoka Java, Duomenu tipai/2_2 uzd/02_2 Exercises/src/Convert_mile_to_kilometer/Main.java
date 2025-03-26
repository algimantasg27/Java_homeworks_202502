package Convert_mile_to_kilometer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        int inputMiles = Integer.valueOf(scanner.nextLine());
        scanner.close();

        double result = (inputMiles * 1.6 * 10.0 / 10.0);
        System.out.println(inputMiles + " miles is " + result + " kilometers");

    }
}