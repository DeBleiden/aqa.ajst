package net.absoft.mortalwombat;

public class AgeChecker {
    private int minAge = 21;

    public void setMinAge (int minAge) {
        this.minAge = minAge;
    }

    public boolean canPlayGame(int age) {
        return age >= minAge;
    }
}
