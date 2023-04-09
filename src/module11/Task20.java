package module11;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int number = 100; number <= 999; number++) {
            if (number % 80 == 45) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
