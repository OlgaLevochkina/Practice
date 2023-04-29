package module13;

public class Task22 {
    public static void main(String[] args) {
        int count = 0, totalSum = 0;
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int sum = firstDigit + secondDigit + lastDigit;
            if ((int) Math.pow(sum, 3) == i) {
                System.out.print(i + " ");
                count++;
                totalSum += i;
            }
        }
        System.out.println("\nThe quantity of Armstrong's numbers is " + count);
        System.out.println("The sum is " + totalSum);
    }
}
