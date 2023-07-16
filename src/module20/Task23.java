package module20;

public class Task23 {
    public static void main(String[] args) {
        int drivers = 20;
        int days = 7;
        int minFuel = 0;
        int maxFuel = 10;

        int[] array = new int[days];
//        for (int i = 0; i < days; i++) {
//            int sum = 0;
//            for (int j = 0; j < drivers; j++) {
//                int dailyFuel = minFuel + (int) ((maxFuel - minFuel + 1) * Math.random());
//                sum += dailyFuel;
//                array[j] += dailyFuel;
//            }
//
//            System.out.println(i + ": " + sum);
 //       }
//        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
