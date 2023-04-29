package module13;

public class Task3 {
    public static void main(String[] args) {
        int min = 10, max = 99, sum = 0;
        System.out.print("The even numbers are ");
        for (int i = 0; i < 20; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            if (randomNumber % 2 == 0) {
                System.out.print(randomNumber + " ");
                sum = sum + randomNumber;
            }
        }
        System.out.println("\nThe sum of even numbers is " + sum);
    }
}
