package module20;

public class Task18 {
    public static final int QUANTITY = 3000;
    public static final int PLAYER_MIN = 1;
    public static final int PLAYER_MAX = 22;

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillArray(array);
        printArray(array);
        System.out.println();
        int[] statistics = getStatistics(array);
        printArray(statistics);
        System.out.println("The winner(s) is ");
        System.out.println();
        getWinners(statistics);
        System.out.println("The loser(s) is ");
        getLosers(statistics);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillArray(int[] array) {   //results
        for (int i = 0; i < array.length; i++) {
            array[i] = PLAYER_MIN + (int) ((PLAYER_MAX - PLAYER_MIN + 1) * Math.random());
        }
    }

    public static int[] getStatistics(int[] array) {   // statistics on results
        int[] statistics = new int[PLAYER_MAX];
        for (int value : array) {
            statistics[value - 1]++;
        }
        return statistics;
    }

    public static void getWinners(int[] array) {
        int maxValue = 0;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                System.out.print((i + 1) + " ");
            }
        }
    }


    public static void getLosers(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
