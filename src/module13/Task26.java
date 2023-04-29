package module13;

public class Task26 {   //???
    public static void main(String[] args) {
        int min = -30, max = 30;
        int originalNumber = min + (int) ((max - min + 1) * Math.random());
        System.out.println(originalNumber);
        for (int i = 0; i < 14; i++) {
            int newNumber = min + (int) ((max - min + 1) * Math.random());
            System.out.print(newNumber + " ");
            System.out.println();
            if (newNumber < 0 && originalNumber < 0 || newNumber >= 0 && originalNumber >= 0) {
                System.out.println(newNumber + " ");
            }
            originalNumber = newNumber;
        }
    }
}
