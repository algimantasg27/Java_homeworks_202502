
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputText = scanner.nextLine();
            if (inputText != "") {
                String[] inputTextAll = inputText.split(" ");
//                int indexOfSpace = inputText.indexOf(" ");
//                System.out.println(inputText.substring(0, indexOfSpace));
                System.out.println(inputTextAll[0]);
            } else {break;};
        }



    }
}
