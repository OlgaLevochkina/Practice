package module17;

import static module17.Reader.readInputNumber;

public class Task36 {
    public static void main(String[] args) {
        System.out.println(checkIfEven(readInputNumber()));
    }

    public static int checkIfEven(int number) {
        int countEven = 0, countUnEven = 0, lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                countEven++;
            } else {
                countUnEven++;
            }
            number /= 10;
        }
        return Integer.compare(countEven, countUnEven);
    }
}
