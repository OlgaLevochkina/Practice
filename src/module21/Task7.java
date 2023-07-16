package module21;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(getRequiredSurnames());
    }

    public static int getRequiredSurnames() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 15; i++) {
            String surname = scanner.next();
            if (surname.charAt(0) == 'A' || surname.charAt(surname.length() - 1) == 'Z') {
                count++;
            }
        }
        return count;
    }
}
