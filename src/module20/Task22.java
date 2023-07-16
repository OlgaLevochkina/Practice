package module20;

public class Task22 {
    public static void main(String[] args) {
        int quantityFlights = 10;
        int minFamilyMembers = 0;
        int maxFamilyMembers = 4;
        int[] array = new int[quantityFlights];
        for (int i = 0; i < args.length; i++) {
            int numberOfFamilyMembers = minFamilyMembers + (int) ((maxFamilyMembers - minFamilyMembers + 1) * Math.random());
            while (numberOfFamilyMembers != 0) {
                array[i] += numberOfFamilyMembers;
                numberOfFamilyMembers = minFamilyMembers + (int) ((maxFamilyMembers - minFamilyMembers + 1) * Math.random());
            }
        }

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
