package Gym_Management_System;

import java.util.ArrayList;

public class GymClass {

    private String className;
    private String schedule;
    private ArrayList<String> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<String>();
    }

    public String getClassName() {
        return className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void enroll(Member member) {

        this.enrolledMembers.add(member.getName());
    }

    public String getenrolledMembers (ArrayList<String> members) {

        String names = "";

//        Jeigu as vel gerai supratau salyga,tai turi atspasudinti vardus jeigu dalyviu daugiau nei 1.

//        if (members.size() > 1) {
//            for (String name: members ) {
//                names += name + ", ";
//            }
//        }

//        Bet pagal pavyzdi parodyta "Output should be: "

        for (String name: members ) {
            names += name + ", ";
        }

        return names;
    }

    @Override
    public String toString() {
        return getClassName() + " (" + getSchedule() + ") : " + getenrolledMembers(this.enrolledMembers);
    }

}
