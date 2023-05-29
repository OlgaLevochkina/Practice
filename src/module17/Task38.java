package module17;

import static module17.Reader.readInputNumber;

public class Task38 {
    public static void main(String[] args) {
        int x = readInputNumber();
        int y = readInputNumber();
        System.out.println(findQuarter(x, y));

    }

    public static int findQuarter(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x < 0 && y > 0) {
            return 2;
        } else {
            return -1;
        }
    }
}
