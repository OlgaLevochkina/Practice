package module14;

public class Task2 {
    public static void main(String[] args) {
        int min = 1, max = 60;
        int bestResultStudent = max;
        int studentNumber = 1;
        for (int i = 1; i <= 150; i++) {
            int studentsTime = min + (int) ((max - min + 1) * Math.random());
            if (studentsTime < bestResultStudent) {
                studentNumber = i;
                bestResultStudent = studentsTime;
            }
        }
        System.out.println("The best result is student " + studentNumber + " who ran for " + bestResultStudent + " minute(s)");
    }
}
