package org.example;

public class PlateValidator {

    public static boolean isValid(String plate) {
        if (plate == null) return false;

        String p = PlateNormalizer.normalize(plate);

        return p.matches("^[A-Z]{1,3}-[A-Z]{1,2} [0-9]{1,4}$");
    }
}
