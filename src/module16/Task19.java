package module16;

public class Task19 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i = i + 10) {
            int sum = 0;
            for (int j = 1; j < i; j = j + 2) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 10 == 0) {
                System.out.println(i + " sum:" + sum);
            }
        }
    }
}
