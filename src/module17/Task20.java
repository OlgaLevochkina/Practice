package module17;

public class Task20 {
    public static void main(String[] args) {
        findDivisors(Reader.readInputNumber());
    }

    public static void findDivisors(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Primary number");
        }
    }
}
