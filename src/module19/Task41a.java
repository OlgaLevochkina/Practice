package module19;

public class Task41a {
    public static void main(String[] args) {
        System.out.println("Проверка для четного кол-во елементов масива");
        int[] arr = init(6);
        System.out.println("До");
        print(arr);
        System.out.println("После");
        print(modifyArray(arr));
        System.out.println();
        System.out.println("Проверка для не четного кол-во елементов масива");
        arr = init(5);
        System.out.println("До");
        print(arr);
        System.out.println("После");
        print(modifyArray(arr));
    }

    private static int[] init(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static void print(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    private static int[] modifyArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int index = 0;
        for (int i = getMidIndex(array); i < array.length; i++) {
            reverseArray[index] = array[i];
            index++;
        }
        for (int i = 0; i < getMidIndex(array); i++) {
            reverseArray[index] = array[i];
            index++;
        }
        return reverseArray;
    }

    private static int getMidIndex(int[] array) {
        return array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
    }
}
