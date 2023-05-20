package module16;

public class Task12 {
    public static void main(String[] args) {
        int maxSum = 1;
        int number = 100000;
        int numberWithMaxSum = 1;
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {   // ne vklyuchat samo chislo !!!
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > maxSum) {
                numberWithMaxSum = i;
                maxSum = sum;
            }
        }
        System.out.println(numberWithMaxSum + " Max sum: " + maxSum);
    }
}
