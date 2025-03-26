package Find_the_number_of_minutes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int inputMinutes = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int minutesOfYear = 60 * 24 * 365;
        int minutesOfDay = 60 * 24;

        int years = inputMinutes / minutesOfYear;
        int minutesLeft = inputMinutes - (years*minutesOfYear);
        int days = minutesLeft / minutesOfDay;

        System.out.println(inputMinutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
