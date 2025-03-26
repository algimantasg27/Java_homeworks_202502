
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();
            if (!(inputName.equals(""))) {
                items.add(new Item(inputName));
            } else {break;}
        }

        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }
    }
}
