package module16;

public class Task17 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int countOfMods = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countOfMods++;
                }
            }
            if (countOfMods == 2 && Math.pow(i, 2) <= 999) {
                System.out.println(i + " ");
            }
        }
    }
}
