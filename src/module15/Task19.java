package module15;

public class Task19 {
    public static void main(String[] args) {
        int min = 1, max = Integer.MAX_VALUE;
        for (int i = 0; i < 15; i++) {
            int sum = 0;
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
        }
    }
}
