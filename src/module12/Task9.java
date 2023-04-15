package module12;

public class Task9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int squareOfTheFirstDigit = (int) Math.pow(firstDigit, 2);
            int squareOfTheSecondDigit = (int) Math.pow(secondDigit, 2);
            int squareOfTheLastDigit = (int) Math.pow(lastDigit, 2);
            if (squareOfTheFirstDigit + squareOfTheLastDigit == squareOfTheSecondDigit) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count);
    }
}
