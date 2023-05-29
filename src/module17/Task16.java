package module17;

import static module17.Reader.readInputNumber;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(findTheFirstNumber(readInputNumber()));
    }

    public static int findTheFirstNumber(int clientNumber) {
        while (clientNumber >= 10) {
            clientNumber /= 10;
        }

        return clientNumber;
    }
}
