package SortingbyLastCharacter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Eve", "Alice", "Charlie", "Bob", "Joe", "Lisa"));
//        names.sort(Comparator.comparing((String::getChars).reversed());
        names.sort( (x, y) -> Character.compare(x.charAt(x.charAt(x.) - y.charAt(y.charAt(y.length()-1))));
//        names.sort((x, y) -> x.compareTo(y));
        System.out.println(names);
    }
}
