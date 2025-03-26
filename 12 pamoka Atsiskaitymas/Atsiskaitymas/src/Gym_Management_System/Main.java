package Gym_Management_System;

public class Main {
    public static void main(String[] args) {

        Member freshMember = new Member(18, "Jurgis", 60);
        System.out.println(freshMember);

        System.out.println("*************************");

//        Membership membership = new Membership(5,9);

        System.out.println("*************************");

        Membership membership = new MonthlyMembership(9, 18, 8);
        System.out.println(membership);

        System.out.println("*************************");

        Membership yearlyMembership = new AnnualMembership(70, 82);
        System.out.println(yearlyMembership);

        System.out.println("*************************");

        GymClass pilates = new GymClass("Pilates", "Tuesday 7PM");
        System.out.println(pilates);

        pilates.enroll(new Member(157, "Michael", 55));
        System.out.println(pilates);

        pilates.enroll(new Member(28, "Ernesto", 81));
        System.out.println(pilates);

        GymClass yoga = new GymClass("Yoga", "Friday 9AM");
        yoga.enroll(new Member(78, "Jeffery", 54));

        System.out.println(yoga);
    }
}