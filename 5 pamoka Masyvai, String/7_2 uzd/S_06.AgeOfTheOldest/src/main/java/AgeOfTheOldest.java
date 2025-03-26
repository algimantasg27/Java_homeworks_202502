
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ageArray = new ArrayList<>();

        while (true) {
            String inputText = scanner.nextLine();
            
            if (inputText != "") {
                String[] inputTextAll = inputText.split(",");

                for (int i = 1; i <= inputTextAll.length; i = i + 2) {
                    int age = Integer.valueOf(inputTextAll[i]);
                    ageArray.add(age);
                }
            } else {break;};
        }
        int max = 0;
        for (int j = 0; j < ageArray.size(); j++) {
            max = (max >= ageArray.get(j)) ? max : ageArray.get(j);
        }
        System.out.println("Age of the oldest: " + max);

    }
}
