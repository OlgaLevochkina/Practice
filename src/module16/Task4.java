package module16;

public class Task4 {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 1; i <= number; i++) { //kol-vo strok
            for (int j = 1; j <= 12; j++) {  // kolichestvo stolbikov
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
