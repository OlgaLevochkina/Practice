package module15;

public class Task22 {
    public static final int QUANTITY = 15;

    public static void main(String[] args) {
        int min = 1, max = 100;
        int maxIndex = 0, position = 1, sum;
        for (int i = 1; i <= QUANTITY; i++) {
            sum = 0;
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            System.out.print(randomNumber + " ");
            while (randomNumber > 10) {
                int numberWithoutLastDigit = randomNumber / 10;
                int lastDigit = randomNumber - numberWithoutLastDigit * 10;
                sum += lastDigit;
                randomNumber = numberWithoutLastDigit;
            }
            sum += randomNumber;
            System.out.println("(" + sum + ")");
            if (sum > maxIndex) {
                maxIndex = sum;
                position = i;
            }
        }
        System.out.println("The highest sum is under " + position + " number");
    }
}
