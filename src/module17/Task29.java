package module17;

import static module17.Reader.readInputNumber;

public class Task29 {
    public static void main(String[] args) {
        findMods(readInputNumber());
    }

    public static void findMods(int number) {
        int count = 0;
        for (int i = number; i <= 2 * number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}

