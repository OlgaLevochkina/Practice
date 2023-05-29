package module17;

import static module17.Reader.readInputNumber;

public class Task31 {
    public static void main(String[] args) {
        int smallerNumber = readInputNumber();
        int biggerNumber = readInputNumber();
        findMods(smallerNumber, biggerNumber);
    }

    public static void findMods(int smallerNumber, int higherNumber) {
        int sum = 0;
        for (int i = smallerNumber; i < higherNumber; i++) {
            int sum2 = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum2 += j;
                }
            }
            if (sum2 > sum) {
                sum = sum2;
            }
        }
        System.out.println(sum);
    }
}
