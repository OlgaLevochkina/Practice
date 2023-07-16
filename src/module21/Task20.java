package module21;

import java.util.Scanner;

public class Task20 {
    public static final int QUANTITY = 25;

    public static void main(String[] args) {
        //   String input = ("abrakadabra");
        estimateTheLongestString();
    }

    public static String makeUniqueString(String input) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == (input.charAt(j))) {
                    count++;
                }
            }
            if (count == 1) {
                unique.append(input.charAt(i));
            }
        }
        return unique.toString();
    }

    public static void estimateTheLongestString() {
        String theLongest = "";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < QUANTITY; i++) {
            String unique = makeUniqueString(scanner.next());
            if (unique.length() > theLongest.length()) {
                theLongest = unique;
            }
        }
        new StringBuilder(theLongest);
    }
}
