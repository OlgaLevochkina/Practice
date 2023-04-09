package module11;

public class Task42 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int sum = firstDigit + secondDigit + lastDigit;
            if (i % sum == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
