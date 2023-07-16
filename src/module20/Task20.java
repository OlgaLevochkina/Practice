package module20;

public class Task20 {
    public static final int QUANTITY = 300;
    public static final int CANDIDATE_MIN = 1;
    public static final int CANDIDATE_MAX = 12;

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillArray(array);
        printArray(array);
        int[] newArrayResults = countResults(array);
        System.out.println();
        estimateTheWinner(newArrayResults);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = CANDIDATE_MIN + (int) ((CANDIDATE_MAX - CANDIDATE_MIN + 1) * Math.random());
        }
    }

    public static int[] countResults(int[] array) {
        int[] newArrayResults = new int[CANDIDATE_MAX];
        for (int index : array) {
            newArrayResults[index - 1]++;
        }
        return newArrayResults;
    }


    public static void estimateTheWinner(int[] array) {
        int maxVotes = 0;
        for (int value : array) {
            if (value > maxVotes) {
                maxVotes = value;
            }
        }
        int minimumToWin = (CANDIDATE_MAX * 10) / 100;
        if (maxVotes < minimumToWin) {
            System.out.println("No winner found");
        } else {
            System.out.println("The winner(s) is ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == maxVotes) {
                    System.out.println((i + 1) + " ");
                }
            }
        }
    }
}
