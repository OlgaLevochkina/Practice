package module15;

public class Task38 {
    public static void main(String[] args) {
        int highestNumber = 99;
        int multiplicationOfDigits = (highestNumber / 10) * (highestNumber % 10);
        while (multiplicationOfDigits != 0 && highestNumber % multiplicationOfDigits != 0) {
            highestNumber--;
            multiplicationOfDigits = (highestNumber / 10) * (highestNumber % 10);
        }
        System.out.println(highestNumber);
    }
}
