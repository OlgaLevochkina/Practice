package module13;

public class Task25 {
    public static void main(String[] args) {
        int min = 10, max = 99;
        int originalNumber = min + (int) ((max - min + 1) * Math.random());
        System.out.println(originalNumber);
        for (int i = 0; i < 24; i++) {
            int newNumber = min + (int) ((max - min + 1) * Math.random());
            if (newNumber % originalNumber == 0) {
                System.out.print(newNumber + " ");
            }
        }
    }
}
