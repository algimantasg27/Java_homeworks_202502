
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputText = scanner.nextLine();
            if (inputText != "") {
                String[] inputTextAll = inputText.split(" ");
                for (String word: inputTextAll) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }
            } else {break;};
        }



    }
}
