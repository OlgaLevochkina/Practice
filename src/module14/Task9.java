package module14;

public class Task9 {
    public static final int MIN = 100;
    public static final int MAX = 999;
    public static final int QUANTITY = 24;

    public static void main(String[] args) {
        int position = 1;
        int originalNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        System.out.println(originalNumber);
        for (int i = 1; i < QUANTITY; i++) {
            int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(newNumber + " ");
            if (newNumber > originalNumber) {
                originalNumber = newNumber;
                position = i + 1;
            }
        }
        System.out.println("\nThe highest number is " + originalNumber);
        System.out.println("The highest score is under " + position + " number.");
    }
}
