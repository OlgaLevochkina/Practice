package module15;

public class Task52 {
    public static final int MIN = 1;
    public static final int MAX = 6;
    public static final int WINNING_POINTS = 100;

    public static void main(String[] args) {
        int playerOnePoints = 0, playerTwoPoints = 0;
        while (playerOnePoints < WINNING_POINTS || playerTwoPoints < WINNING_POINTS) {
            int playerOnePointsCubeOne = MIN + (int) ((MAX - MIN + 1) * Math.random());
            int playerOnePointsCubeTwo = MIN + (int) ((MAX - MIN + 1) * Math.random());
            playerOnePoints = playerOnePoints + playerOnePointsCubeOne + playerOnePointsCubeTwo;
            int playerTwoPointsCubeOne = MIN + (int) ((MAX - MIN + 1) * Math.random());
            int playerTwoPointsCubeTwo = MIN + (int) ((MAX - MIN + 1) * Math.random());
            playerTwoPoints = playerTwoPoints + playerTwoPointsCubeTwo + playerTwoPointsCubeOne;
        }
        System.out.println("Player 1 total - " + playerOnePoints);
        System.out.println("Player 2 total - " + playerTwoPoints);

        if (playerOnePoints > playerTwoPoints) {
            System.out.println("First player wins");
        } else if (playerTwoPoints > playerOnePoints) {
            System.out.println("Second player wins");
        } else {
            System.out.println("Draw");
        }
    }
}
