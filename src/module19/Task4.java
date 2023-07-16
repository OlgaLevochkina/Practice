package module19;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(check(17));  // = 0
        System.out.println(check(9876));  // = 1
    }

    public static int check(int num) {
        int temp = num % 10;
        num = num / 10;
        while (num > 0) {
            if (temp + 1 != num % 10) {
                return 0;
            } else {
                temp = num % 10;
                num /= 10;
            }
        }
        return 1;
    }
}
