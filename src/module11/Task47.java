package module11;

public class Task47 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int newNumber = lastDigit * 100 + secondDigit * 10 + firstDigit;
            double numberSquare = Math.sqrt(i * newNumber);
            if ((numberSquare == 1.0 * Math.round(numberSquare)) && lastDigit != 0 && i != newNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
