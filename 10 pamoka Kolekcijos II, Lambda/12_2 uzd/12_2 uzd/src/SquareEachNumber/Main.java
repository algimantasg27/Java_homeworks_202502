package SquareEachNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbers.replaceAll(x -> (int)Math.pow(x, 2));
        System.out.println(numbers);
        numbers.forEach(System.out::println);
    }
}
