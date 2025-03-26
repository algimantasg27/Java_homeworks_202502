
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String inputString = scan.nextLine();

        System.out.println("Give an integer: ");
        int inputInteger = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double: ");
        double inpputDouble = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean: ");
        boolean inputBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + inputString);
        System.out.println("You gave the integer " + inputInteger);
        System.out.println("You gave the double " + inpputDouble);
        System.out.println("You gave the boolean " + inputBoolean);
    }
}
