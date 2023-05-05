package module14;

public class Task1 {
    public static void main(String[] args) {
        int min = 1, max = 60;
        int bestResultStudent = max;
        for (int i = 0; i < 150; i++) {
            int studentsTime = min + (int) ((max - min + 1) * Math.random());
            if (studentsTime < bestResultStudent) {
                bestResultStudent = studentsTime;
            }
        }
        System.out.println("The best result is " + bestResultStudent + " minutes");
    }
}
