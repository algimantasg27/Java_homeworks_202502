
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputText = scanner.nextLine();
            if (inputText != "") {
                String[] inputTextAll = inputText.split(" ");
                for (String word: inputTextAll) {
                    System.out.println(word);
                }
            } else {break;};
        }

    }
}
