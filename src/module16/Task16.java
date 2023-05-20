package module16;

public class Task16 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i < 100; i = i + 2) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                System.out.println(i + " " + sum + " ");
            }
        }
    }
}
