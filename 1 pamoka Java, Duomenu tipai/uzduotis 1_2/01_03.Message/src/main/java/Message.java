
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String word = scanner.nextLine();
        // Write your program here
        scanner.close();
        System.out.println(word);
    }
}
