package module19;


// schitaet pervie 5 elementov masiva

public class Task2 {
    public static void main(String[] args) {
        int k = 5;
        int[] array = {3, 5, 6, 7, 3, 9, 1, 6};
        System.out.println(what(array, k));

    }

    public static int what(int[] n, int k) {
        int s = 0;
        for (int i = 0; i < k; i++) {
            s = s + n[i];
        }
        return s;

    }
}
