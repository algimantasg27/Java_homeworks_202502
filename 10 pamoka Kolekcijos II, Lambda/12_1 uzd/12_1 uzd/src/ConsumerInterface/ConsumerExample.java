package ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer <String> printMessage = x -> {
            System.out.println(x + " is awesone!");
        };

        printMessage.accept("Java");
        printMessage.accept("Java and C#");
    }
}
