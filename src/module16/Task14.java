package module16;

public class Task14 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 10; i < 100; i++) {
            boolean isPrime = false;
            for (int j = 2; j * j <= i; j++) {
                isPrime = (i % j == 0);
                if (isPrime) {
                    break;
                }
            }
            if (!isPrime) {
                count++;
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal sum is " + sum);
        System.out.println("Total number of prime numbers is " + count);
    }
}
