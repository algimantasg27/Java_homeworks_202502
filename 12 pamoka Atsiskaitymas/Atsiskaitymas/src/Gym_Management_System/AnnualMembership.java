package Gym_Management_System;

public class AnnualMembership extends Membership{

    private final Double COST = 300.0;
    private final int DURATION = 12;

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
    }

    @Override
    public double getCost(int duration) {
        return 0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + COST + ", Duration: " + DURATION + " months";
    }

    // Nesuprantama užduotis kas paduodama į parametrus: Membership yearlyMembership = new AnnualMembership(70, 82);
}
