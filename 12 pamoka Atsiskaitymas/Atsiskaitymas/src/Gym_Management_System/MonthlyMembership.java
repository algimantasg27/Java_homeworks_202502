package Gym_Management_System;

public class MonthlyMembership extends Membership{

    private int duration;

    public MonthlyMembership(int membershipId, int memberId, int duration) {
        super(membershipId, memberId);
        this.duration = duration;

    }

    @Override
    public double getCost(int duration) {
        return duration * 30;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, Cost: " + getCost(this.duration) +
                ", Duration: " + this.duration + " months";
    }
}
