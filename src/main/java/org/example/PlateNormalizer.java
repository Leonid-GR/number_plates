package org.example;

public class PlateNormalizer {

    public static String normalize(String plate) {
        if (plate == null) return null;

        String s = plate.trim().toUpperCase();


        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        return s;
    }
}
