package module20;

public class Task19 {
    public static final int QUANTITY = 10000;
    public static final int MIN_TICKETS = 0;
    public static final int MAX_TICKETS = 1;

    public static final int QUANTITY_OF_PLAYS = 10;

    public static void main(String[] args) {
        int[] arrayTickets = getStatisticsOnTickets();
        printArray(arrayTickets);
        System.out.println();
        getTheMostPopularPlay(arrayTickets);
        System.out.println();
        getTheLessPopularPlay(arrayTickets);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static int[] getStatisticsOnTickets() {
        int[] arrayTickets = new int[QUANTITY_OF_PLAYS];
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < arrayTickets.length; j++) {
                int ticket = getNumberOfTickets();
                arrayTickets[j] = arrayTickets[j] + ticket;
            }
        }
        return arrayTickets;
    }

    public static int getNumberOfTickets() {
        return MIN_TICKETS + (int) ((MAX_TICKETS - MIN_TICKETS + 1) * Math.random());
    }

    public static void getTheMostPopularPlay(int[] array) {
        int maxTickets = getTheHighestNumberOfTicketsSold(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxTickets) {
                System.out.println((i + 1) + " ");
            }
        }
    }

    public static int getTheHighestNumberOfTicketsSold(int[] array) {
        int maxTickets = 0;
        for (int value : array) {
            if (value > maxTickets) {
                maxTickets = value;
            }
        }
        return maxTickets;
    }

    public static void getTheLessPopularPlay(int[] array) {
        System.out.println("The less popular play(s) is ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 100) {
                System.out.println((i + 1) + " ");
            }
        }
    }
}
