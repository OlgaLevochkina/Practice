package module17;

import java.util.Scanner;

import static module17.Reader.readInputNumber;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(createNewNumber(readInputNumber()));
    }

    public static int createNewNumber(int clientNumber) {
        int tempNumber = clientNumber;
        int count = 0;
        while (tempNumber > 0) {
            count++;
            tempNumber /= 10;
        }
        int newlyCreatedNumber = (int) Math.pow(10, count - 1);

        return clientNumber % newlyCreatedNumber;
    }
}
