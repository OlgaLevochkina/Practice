package module12;
//0 == reshka, 1 == orel

public class Task13 {
    public static final int COUNT = 10;

    public static void main(String[] args) {
        int reshka = 0, orel = 0;
        int min = 0, max = 1;
        for (int i = 0; i < COUNT; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            if (randomNumber == 0) {
                reshka++;
            } else {
                orel++;
            }
        }
        System.out.println("First round results: reshka = " + reshka + ", orel = " + orel);
        if (orel > reshka) {
            System.out.println("Orel wins by " + (orel * 100 / COUNT) + "%");
        } else {
            System.out.println("Reshka wins by " + (reshka * 100 / COUNT) + "%");
        }
    }
}
