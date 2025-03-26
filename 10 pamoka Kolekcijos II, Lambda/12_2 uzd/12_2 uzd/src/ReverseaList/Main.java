package ReverseaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3, 6, 4, 9, 7));
        numbers.sort((x, y) -> y - x);
        System.out.println(numbers);
    }
}
