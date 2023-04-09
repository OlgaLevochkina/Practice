package module11;

public class Task39 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int multiplication = firstDigit * lastDigit;
            if (multiplication > 9 && multiplication < 100) {
                System.out.print(i + " ");
            }
        }
    }
}
