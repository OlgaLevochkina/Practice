package module16;

public class Task6 {
    public static void main(String[] args) {
        int bullCost = 10;
        int cowCost = 5;
        for (int i = 0; i <= 10; i++) {  // i == bulls
            for (int j = 0; j <= 20; j++) { //j = cows
                if (i * bullCost + j * cowCost <= 100) {
                    System.out.print(" " + i + " " + j);
                }
            }
            System.out.println();
        }
    }
}

