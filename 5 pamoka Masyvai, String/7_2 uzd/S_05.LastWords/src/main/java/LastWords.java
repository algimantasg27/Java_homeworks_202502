
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputText = scanner.nextLine();
            if (inputText != "") {
                String[] inputTextAll = inputText.split(" ");
                System.out.println(inputTextAll[inputTextAll.length-1]);
            } else {break;};
        }

    }
}
