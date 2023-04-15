package module12;

public class Task14 {
    public static void main(String[] args) {
        int min = -20, max = 20;
        int countNegative = 0, countPositive = 0;
        for (int i = 0; i < 30; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            if (randomNumber < 0) {
                countNegative++;
            } else {
                countPositive++;
            }
        }
        System.out.println(countNegative + " negative numbers and " + countPositive + " positive numbers");
        if (countNegative == countPositive) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
