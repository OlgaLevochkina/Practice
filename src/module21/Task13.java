package module21;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        getOnlyCapitals(input);
    }

    public static void getOnlyCapitals(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                System.out.print(input.charAt(i));
            }
        }
    }
}
