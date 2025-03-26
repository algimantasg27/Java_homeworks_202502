

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne (int number) {
        int numb = 1;
        while (number >= numb) {
            System.out.println(number);
            number--;
        }
    }
}
