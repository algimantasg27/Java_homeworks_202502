
public class AdvancedAstrology {

    public static void printStars(int number) {
            for (int numb = 0; number > numb; numb++) {
                System.out.print("*");
            }
    }

    public static void printSpaces(int number) {
        for (int numb = 0; number > numb; numb++) {
            System.out.print(" ");
        }    }

    public static void printTriangle(int size) {
        for (int number = 1; size >= number; number++) {
            System.out.println();
            printStars(number);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
