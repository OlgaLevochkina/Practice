package module12;

public class Task11 {
    public static final int QUANTITY_OF_STUDENTS = 200;

    public static void main(String[] args) {
        int min = 0, max = 1, agreed = 0;
        for (int i = 0; i < QUANTITY_OF_STUDENTS; i++) {
            int studentsAnswers = min + (int) ((max - min + 1) * Math.random());
            if (studentsAnswers == 1) {
                agreed++;
            }
        }
        int notAgreed = QUANTITY_OF_STUDENTS - agreed;
        System.out.println(agreed + " students are going and " + notAgreed + " students refused to go.");
        if (agreed > 100) {
            System.out.println("More than half of the students are going.");
        } else {
            System.out.println("Less than a half of students are willing to go.");
        }
    }
}
