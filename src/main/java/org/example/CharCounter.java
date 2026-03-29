package org.example;
public class CharCounter {

    public static String countChars(String text) {

        if (text == null) {
            throw new IllegalArgumentException();
        }

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (text.charAt(k) == c) {
                    printed = true;
                    break;
                }
            }

            if (!printed) {
                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == c) {
                        count++;
                    }
                }

                result += c + "-" + count + ";";
            }
        }

        return result;
    }
}
