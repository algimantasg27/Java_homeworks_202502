package ModifyNamesUsingreplaceAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Lisa", "KARMEN", "123"));
        names.replaceAll(String::toUpperCase);
        System.out.println(names);
    }
}
