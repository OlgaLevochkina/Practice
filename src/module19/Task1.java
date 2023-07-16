package module19;

public class Task1 {
    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        System.out.println(makeNumber(n, k));
    }

    public static int makeNumber(int n, int k) {
        int num = 0;
        int i = 0;
        while (i <= n) {
            num = num*10 + k;
            i += 1;
        }
        return num;
    }
}
