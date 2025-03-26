package Function_Interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, String> intToString = (x) -> ("Value: " + x);

        System.out.println(intToString.apply(5));    }
}