package module16;

public class Task7 {
    public static void main(String[] args) {
        int number = 75;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
