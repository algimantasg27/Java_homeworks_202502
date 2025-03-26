

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber (int number) {
        int numb = 1;
        while (number >= numb) {
            System.out.println(numb);
            numb++;
        }
    }
}
