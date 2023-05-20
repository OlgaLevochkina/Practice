package module16;

public class Task5 {
    public static void main(String[] args) {
        int rows = 10; //vneshnee
        int columns = 100; // vnutrennee
        for (int i = 2; i <= rows; i++) {
            for (int j = 10; j < columns; j++) {
                if (j % i == 0) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
