
import java.util.Scanner;
import java.util.ArrayList;


public class NameOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ageArray = new ArrayList<>();
        ArrayList<String> stringArray = new ArrayList<>();
        String[] inputTextAll = {};

        while (true) {
            String inputText = scanner.nextLine();

            if (inputText != "") {
                inputTextAll = inputText.split(",");

                for (int j = 0; j < inputTextAll.length; j++) {
                    stringArray.add(inputTextAll[j]);
                }
                ageArray.add(Integer.valueOf(inputTextAll[1]));
            } else {break;};
        }

        int max = 0;
        String name = "";

        for (int k = 0; k < ageArray.size(); k++) {
            max = (max >= ageArray.get(k)) ? max : ageArray.get(k);
        }

        int index = ageArray.indexOf(max);
        int nameIndex = index * 2;

        System.out.println("Name of the oldest: " + stringArray.get(nameIndex));

    }
}
