package module13;

public class Task19 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        for (int i = 10; i < 100; i++) {
            int originalNumberFirstDigit = i / 10;
            int originalNumberLastDigit = i % 10;
            int newNumber = i * 2;
            int newNumberFirstDigit = newNumber / 10;
            int newNumberLastDigit = newNumber % 10;
            if (originalNumberFirstDigit + originalNumberLastDigit == newNumberFirstDigit + newNumberLastDigit) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println("\nThe number of such numbers is " + count);
        System.out.println("The total sum of such numbers is " + sum);
    }
}
