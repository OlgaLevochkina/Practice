package module16;

public class Task8 {
    public static void main(String[] args) {
        int number = 75;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ": ");
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    System.out.print(j + " ");
                }
            }
            System.out.println("sum: " + sum + " ");
            System.out.println();
        }
    }
}
