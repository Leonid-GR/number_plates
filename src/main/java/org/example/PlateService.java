package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlateService {

    public static String getCityCode(String plate) {
        if (!PlateValidator.isValid(plate)) return null;

        return plate.substring(0, plate.indexOf("-"));
    }

    public static String maskPlate(String plate) {
        String city = getCityCode(plate);
        if (city == null) return null;

        return city + "- **";
    }

    public static List<String> extractAllPlates(String text) {

        List<String> list = new ArrayList<>();
        if (text == null) return list;

        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            String candidate = words[i] + " " + words[i + 1];

            if (PlateValidator.isValid(candidate)) {
                list.add(candidate);
            }
        }

        return list;
    }
}
