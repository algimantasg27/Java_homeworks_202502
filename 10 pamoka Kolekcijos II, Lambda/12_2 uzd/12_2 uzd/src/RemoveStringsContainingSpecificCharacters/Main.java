package RemoveStringsContainingSpecificCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "pig", "pepsi"));
        words.removeIf(x -> x.contains("e"));
        System.out.println(words);
        words.forEach(System.out::println);
    }
}
