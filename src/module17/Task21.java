package module17;

import static module17.Reader.readInputNumber;

public class Task21 {
    public static void main(String[] args) {
        int x = readInputNumber();
        int y = readInputNumber();
        System.out.println(findDistance(x, y));
    }

    public static double findDistance(int clientX, int clientY) {
        int initialX = 0, initialY = 0;

        return Math.sqrt(Math.pow((clientY - initialY), 2) + Math.pow((clientX - initialX), 2));
    }
}
