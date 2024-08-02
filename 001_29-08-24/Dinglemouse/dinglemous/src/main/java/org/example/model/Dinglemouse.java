package org.example.model;

public class Dinglemouse {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        return new int[] {ownedPet(catYears, 4), ownedPet(dogYears, 5)};
    }

    private static int ownedPet(int petYears, int yearsAfterTwo) {
        return petYears < 15 ? 0 : petYears < 24 ? 1 : 2 + (petYears - 24) / yearsAfterTwo;
    }

}
