package Predicate_Interface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> {
            if (x % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
        System.out.println(isEven.test(-2));
    }
}
