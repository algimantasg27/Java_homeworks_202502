
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String profession = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + profession + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + profession + " forever.");
//        System.out.println("I will tell you a story, but I need some information first.");
//        System.out.println("What is the main character called?");
//        name = scanner.nextLine();
//        System.out.println("What is their job?");
//        profession = scanner.nextLine();
//        scanner.close();
//        System.out.println("Here is the story:");
//        System.out.println("Once upon a time there was " + name + ", who was " + profession + ".");
//        System.out.println("On the way to work, " + name + " reflected on life.");
//        System.out.println("Perhaps " + name + " will not be " + profession + " forever.");
    }
}
