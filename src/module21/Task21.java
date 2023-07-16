package module21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        checkIfAllAreUnique();
    }

    public static boolean checkIfUnique(String input) {
        boolean isUnique = true;
        for (int i = 1; i <= input.length() - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == (input.charAt(j))) {
                    return false;
                }
            }
        }
        return isUnique;
    }

    public static void checkIfAllAreUnique() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String input = scanner.next();
        while (!input.equals("Stop")) {
            if (checkIfUnique(input)) {
                count++;
            }
            input = scanner.next();
        }
        System.out.println(count);
    }
}
