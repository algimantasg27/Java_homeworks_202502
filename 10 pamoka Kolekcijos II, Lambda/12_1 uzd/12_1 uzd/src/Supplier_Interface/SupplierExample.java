package Supplier_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        ArrayList<String> greetings = new ArrayList<String>();


        Supplier <String> randomGreeting = () -> new String[] {"Hello", "How", "Labas", "Kaip sekasi", "Kuku"}
                [(int)(Math.random() * 10)];

        System.out.println(randomGreeting.get()); // Expected output: one of the greetings randomly chosen

    }
}
