package module11;

public class Task46 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int lastTwoDigits = secondDigit * 10 + lastDigit;
            if (lastTwoDigits % firstDigit == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
