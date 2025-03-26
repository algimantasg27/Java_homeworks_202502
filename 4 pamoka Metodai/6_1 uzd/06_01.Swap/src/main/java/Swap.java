
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());

        int[] additionalVariable = new int[1];

        additionalVariable[0] = array[firstInput];
        array[firstInput] = array[secondInput];
        array[secondInput] = additionalVariable[0];

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
