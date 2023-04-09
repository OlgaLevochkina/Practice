package module11;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Start");
        int number = 10;
        for (int i = 0; i < 90; i++) {
            if (number % 4 == 0) {
                System.out.print("#" + number + " ");
            } else {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println("\nThe end");
    }
}
