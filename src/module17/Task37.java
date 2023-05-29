package module17;

import static module17.Reader.readInputNumber;

public class Task37 {
    public static void main(String[] args) {
        int x1 = readInputNumber();
        int y1 = readInputNumber();
        int x2 = readInputNumber();
        int y2 = readInputNumber();
        System.out.println(findDistance(x1, y1, x2, y2));
    }

    public static int findDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    }
}
