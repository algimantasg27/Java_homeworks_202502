import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();

            if (inputName.equals("")) {
                break;
            } else {
                System.out.print("Duration: ");
                int inputProgramDuration = Integer.valueOf(scanner.nextLine());

                programs.add(new TelevisionProgram(inputName, inputProgramDuration));
            }
        }

        System.out.println("");

        System.out.print("Program's maximum duration? ");
        int inputDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program: programs) {
            if (inputDuration >= program.getDuration()) {
                System.out.println(program.toString());
            }

        }
    }
}
