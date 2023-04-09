package module11;

public class Task43 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            if (firstDigit % 3 == 0 && lastDigit % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
