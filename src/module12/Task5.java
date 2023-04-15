package module12;

public class Task5 {
    public static void main(String[] args) {
        int min = -25, max = 25, countOfPositiveNumbers = 0, countOfEvenNumbers = 0, countOfSingleDigits = 0;
        int randomNumber;
        for (int i = 0; i < 15; i++) {
            randomNumber = min + (int) ((max - min + 1) * Math.random());
            System.out.print(randomNumber + " ");
            if (randomNumber > 0) {
                countOfPositiveNumbers++;
            }
            if (randomNumber % 2 == 0) {
                countOfEvenNumbers++;
            }
            if (randomNumber >= 0 && randomNumber <= 9) {
                countOfSingleDigits++;
            }
        }
        System.out.println("\nThere are " + countOfEvenNumbers + " even numbers");
        System.out.println("There are " + countOfPositiveNumbers + " positive numbers");
        System.out.println("There are " + countOfSingleDigits + " single numbers");
    }
}
