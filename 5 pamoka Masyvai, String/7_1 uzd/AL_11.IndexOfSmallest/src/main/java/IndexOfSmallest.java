
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        int smalest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smalest > number) {
                    smalest = number;
            }
        }

            System.out.println("Smalest number: " + smalest);

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == smalest) {
                System.out.println("Found at index: " + j);
            }

        }
    }
}
