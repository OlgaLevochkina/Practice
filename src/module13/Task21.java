package module13;

public class Task21 {
    public static void main(String[] args) {
        int count = 0, totalSum = 0;
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int tripleMultiplication = (firstDigit * lastDigit) * 3;
            if (i == tripleMultiplication) {
                System.out.print(i + " ");
                count++;
                totalSum += i;
            }
        }
        System.out.println("\nThe quantity of such numbers is " + count);
        System.out.println("The total sum of these numbers is " + totalSum);
    }
}
