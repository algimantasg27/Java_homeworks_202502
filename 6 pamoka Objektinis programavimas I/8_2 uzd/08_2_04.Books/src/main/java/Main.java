import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> booksCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String inputTitle = scanner.nextLine();

            if (inputTitle.equals("")) {
                break;
            } else {
                System.out.print("Pages: ");
                int inputPages = Integer.valueOf(scanner.nextLine());

                System.out.print("Publication year: ");
                int inputPublicationYear = Integer.valueOf(scanner.nextLine());

                booksCollection.add(new Book(inputTitle, inputPages, inputPublicationYear));
            }
        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String inputForPrinting = scanner.next();
        scanner.close();

        if (inputForPrinting.equals("everything")) {
            for (int i = 0; i < booksCollection.size(); i++) {
                System.out.println(booksCollection.get(i).printEverything());
            }
        } else if (inputForPrinting.equals("name")) {
            for (int i = 0; i < booksCollection.size(); i++) {
                System.out.println(booksCollection.get(i).printName());
            }
        }

    }
}
