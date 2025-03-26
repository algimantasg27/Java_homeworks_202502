package AppendaSuffix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>(Arrays.asList("task1", "task2", "task3", "task4"));
        tasks.replaceAll(x -> x + "_done");
        System.out.println(tasks);
    }
}
