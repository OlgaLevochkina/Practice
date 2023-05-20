package module16;

public class Task10 {
    public static void main(String[] args) {
        int highestNumber = 100000;
        for (int i = 1; i <= highestNumber; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
