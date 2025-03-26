
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();
            
            if (inputName.equals("")) {
                break;
            } else {
                System.out.print("Last name: ");
                String inputLastName = scanner.nextLine();

                System.out.print("Identification number: ");
                String inputIdentificationNumber = scanner.nextLine();

                infoCollection.add(new PersonalInformation(inputName, inputLastName, inputIdentificationNumber));
            }
        }

        System.out.println("");

        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}
