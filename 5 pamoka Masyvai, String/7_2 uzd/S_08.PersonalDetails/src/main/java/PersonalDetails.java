
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dateArray = new ArrayList<>();
        ArrayList<String> stringArray = new ArrayList<>();
        String[] inputTextAll = {};
        int sum = 0;

        while (true) {
            String inputText = scanner.nextLine();

            if (inputText != "") {
                inputTextAll = inputText.split(",");

                stringArray.add(inputTextAll[0]);
                dateArray.add(Integer.valueOf(inputTextAll[1]));
            } else {break;};
        }

        int maxNameLetters = 0;
        String longestName = "";

        for (String name: stringArray) {
            if (maxNameLetters < name.length()) {
                maxNameLetters = name.length();
                longestName = name;
            }
        }

        for (int k = 0; k < dateArray.size(); k++) {
            sum += dateArray.get(k);
        }

        double average = sum * 1.0 / dateArray.size() ;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);


    }
}
