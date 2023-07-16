package module21;

public class Task17 {
    public static void main(String[] args) {
        char symbol = '1';
        System.out.println(convertToInt(symbol));
    }

    public static int convertToInt (char symbol){
        return Character.getNumericValue(symbol);
    }
}
