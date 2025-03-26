
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Statistics statistics = new Statistics();

//        System.out.println("Enter numbers:");
//        while (true) {
//            int inputNumber = Integer.parseInt(scanner.nextLine());
//            if (inputNumber != -1) {
//                statistics.addNumber(inputNumber);
//            } else {break;}
//        }

//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);

//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());

        Sum sum = new Sum();
        Even even = new Even();
        Odd odd = new Odd();

                System.out.println("Enter numbers:");
        while (true) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber != -1) {
                sum.addNumber(inputNumber);
                even.addEvenNumber(inputNumber);
                odd.addOddNumber(inputNumber);
            } else {break;}
        }

        System.out.println("Sum: " + sum.getSum());
        System.out.println("Sum of even numbers: " + even.getEvenSum());
        System.out.println("Sum of odd numbers: " + odd.getOddSum());

    }

    static class Sum {
        private int sum;

        public Sum() {
        }

        void addNumber(int number){
            sum += number;
        }

        int getSum() {
            return sum;
        }
    }
    static class Even {
        private int evenSum;
        public Even() {
        }

        void addEvenNumber(int number){
            if (number % 2 == 0) {
                evenSum += number;
            }
        }

        int getEvenSum() {
            return evenSum;
        }
    }
    static class Odd {
        private int oddSum;
        public Odd() {
        }

        void addOddNumber(int number){
            if (number % 2 != 0) {
                oddSum += number;
            }
        }

        int getOddSum() {
            return oddSum;
        }
    }
}
