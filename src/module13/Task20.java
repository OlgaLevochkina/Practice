package module13;

public class Task20 {
    public static void main(String[] args) {
        int count = 0, totalSum = 0;
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int sum = firstDigit + lastDigit;
            if ((int) Math.pow(sum, 3) == (int) Math.pow(i, 2)) {
                System.out.print(i + " ");
                count++;
                totalSum += i;
            }
        }
        System.out.println("\nThe quantity of such numbers is " + count);
        System.out.println("The total sum of these numbers is " + totalSum);
    }
}
