package module13;

public class Task2 {
    public static void main(String[] args) {
        int min = 10, max = 99, sum = 0;
        for (int i = 0; i < 20; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            System.out.print(randomNumber + " ");
            sum = sum + randomNumber;
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
