package module19;

public class Task5 {
    public static void main(String[] args) {
        int [] array = {3, 7, -4, 5, 0, 14, 25, 10, 5, 11};
        int k = 4;
    }

    public static void F(int [] array, int k){
        for (int i = 1; i <= k; i++) {
            array[i] = array[i] + i;
        }
//        for (int i = (n-1); i > (k+1); i++) {     chto za N???
//            if (array[i]%5==0) {
//                array[i] =array[i+1]-i;
//            }
//        }
    }
}
