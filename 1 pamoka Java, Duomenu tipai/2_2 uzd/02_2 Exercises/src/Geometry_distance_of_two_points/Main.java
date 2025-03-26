package Geometry_distance_of_two_points;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1:");
        double inputX1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter y1:");
        double inputY1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter x2:");
        double inputX2 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter y2:");
        double inputY2 = Double.valueOf(scanner.nextLine());

        scanner.close();

        double distanceResult = Math.sqrt(Math.pow((inputX2 - inputX1), 2) + Math.pow((inputY2 - inputY1), 2)) ;

        System.out.println("The distance between the two points is " + distanceResult);
    }
}
