package module21;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        String[] input = new String[quantity];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.next();
        }
        getTheLongestValue(input);
    }

    public static void getTheLongestValue(String[] input) {
        String theLongest = "";
        for (String s : input) {
            if (s.length() > theLongest.length()) {
                theLongest = s;
            }
        }
    }
}
