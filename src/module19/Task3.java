package module19;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(what(2754));
        System.out.println(what(688));

    }

    public static int what(int n) {
        while (n % 2 != 1 && n > 0) {
            n /= 10;
        }
        return n % 10;
    }
}
