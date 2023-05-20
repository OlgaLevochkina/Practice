package module16;

public class Task15 {
    public static void main(String[] args) {
        int sum = 0, count = 0;

        for (int i = 100; i < 1000; i++) {
            int countOfMods = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countOfMods++;
                }
            }
            if (countOfMods == 2) {
                count++;
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Quantity: " + count);
    }
}
