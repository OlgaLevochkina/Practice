package module11;

public class Task33 {
    public static void main(String[] args) {
        int x = 7;
        int initialNumber = (100 / x + 1) * x;
        for (int i = initialNumber; i < 1000; i += x) {
            System.out.print(i + " ");
        }
    }
}


