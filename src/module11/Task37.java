package module11;

public class Task37 {
    public static void main(String[] args) {
        int minNumber = -18, maxNumber = 18;
        for (int i = 0; i < 20; i++) {
            int randomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
            if (randomNumber < 0) {
                System.out.println(randomNumber + " (" + (int) Math.pow(randomNumber, 2) + ")");
            } else if (randomNumber > 0) {
                System.out.println(randomNumber + " (" + Math.round(Math.sqrt(randomNumber)) + ")");
            } else {
                System.out.println(" ");
            }
        }
    }
}
