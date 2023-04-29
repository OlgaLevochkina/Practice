package module13;

public class Task23 {
    public static void main(String[] args) {
        int count = 0, totalSum = 0;
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int doubleSum = (firstDigit + lastDigit) * 2;
            int multiplication = firstDigit * lastDigit;
            if (doubleSum == multiplication) {
                System.out.print(i + " ");
                count++;
                totalSum += i;
            }
        }
        System.out.println("\nThe quantity is " + count);
        System.out.println("The sum is " + totalSum);
    }
}
