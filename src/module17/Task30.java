package module17;

import static module17.Reader.readInputNumber;

public class Task30 {
    public static void main(String[] args) {
        int smallerNumber = readInputNumber();
        int biggerNumber = readInputNumber();
        findMods(smallerNumber, biggerNumber);
    }

    public static void findMods(int smallerNumber, int higherNumber) {
        int maxMod = 0;
        for (int i = smallerNumber; i < higherNumber; i++) {
            int maxMod2 = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    maxMod2 = j;
                }
            }
            if (maxMod2 > maxMod) {
                maxMod = maxMod2;
            }
        }
        System.out.print(maxMod);
    }
}
