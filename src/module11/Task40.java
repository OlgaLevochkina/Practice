package module11;

public class Task40 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            if (firstDigit * lastDigit == Math.pow(secondDigit, 2)) {
                System.out.print(i + " ");
            }
        }
    }
}
