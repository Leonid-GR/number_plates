package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(PlateValidator.isValid("HA-AB 1234"));
        System.out.println(PlateNormalizer.normalize("haab1234"));
        System.out.println(PlateService.maskPlate("HA-AB 1234"));
    }
}