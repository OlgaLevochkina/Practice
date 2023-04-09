package module11;

public class Task8 {
    public static void main(String[] args) {
        int min = -20, max = 35;
        for (int i = 0; i < 15; i++) {
            int randomNumber = max - (int) ((max - min + 1) * Math.random());
            if (randomNumber < 0) {
                System.out.print(randomNumber + "?");
            } else {
                System.out.print(randomNumber+ " ");
            }
        }
    }
}
