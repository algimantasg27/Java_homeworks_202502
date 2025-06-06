package FindandRemoveEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers.removeIf(x -> x % 2 == 0);
        System.out.println(numbers);
    }
}
