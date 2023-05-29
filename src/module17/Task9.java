package module17;

import static module17.Reader.readInputNumber;

public class Task9 {
    public static void main(String[] args) {
        int numberA = readInputNumber();
        int numberB = readInputNumber();
        findEvenNumbers(numberA, numberB);
    }

    public static void findEvenNumbers(int minNumber, int maxNumber) {
        for (int i = minNumber + 1; i < maxNumber; i++) {
            printEvenNumber(i);
        }
    }

    private static void printEvenNumber(int number) {  //vspomogatelnij metod vnutri 'findEvenNumbers'
        if (number % 2 == 0) {
            System.out.print(number + " ");
        }
    }
}
