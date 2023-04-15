package module12;

public class Task8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int difference = firstDigit - lastDigit;
            if (difference >= 0 && difference <= 3) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count);
    }
}
