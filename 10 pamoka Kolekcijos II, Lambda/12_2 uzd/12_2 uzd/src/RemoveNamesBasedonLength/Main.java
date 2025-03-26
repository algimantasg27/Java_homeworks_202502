package RemoveNamesBasedonLength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Lisa", "Eva", "Robert", "Kate"));
        names.removeIf(x -> x.length() < 4 );
        System.out.println(names);
    }
}
