
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        String inputString = scanner.nextLine();

        String answerSearching = "";
        
        for (String word: list) {
            if (word.equals(inputString)) {
                answerSearching = (inputString + " was found!");
                break;
            }
            answerSearching = (inputString + " was not found!");
        }

        System.out.println(answerSearching);
    }
}
