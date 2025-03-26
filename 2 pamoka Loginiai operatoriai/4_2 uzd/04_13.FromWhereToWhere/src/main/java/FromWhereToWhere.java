
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int inputNumberTo = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int inputNumberFrom = Integer.valueOf(scanner.nextLine());

        if (inputNumberFrom <= inputNumberTo) {
            for (int i = inputNumberFrom; i <= inputNumberTo ; i++) {
                System.out.println(i);
            }
        }
    }
}
