package module20;

import static module17.Reader.readInputNumber;

public class Task16 {
    public static final int MIN = 1;
    public static final int MAX = 45;
    public static final int QUANTITY_STUDENTS = 50;
    public static final int QUESTIONS = 20;

    public static void main(String[] args) {
        int[] array = new int[QUESTIONS];
        getCorrectAnswers(array);
        int[] questions = new int[QUESTIONS];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = 0;
        }
        for (int i = 0; i < QUANTITY_STUDENTS; i++) {
            getAnswersFromStudents(array, questions);
        }
        write(questions, QUESTIONS);
    }

    private static void getCorrectAnswers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = readInputNumber();
    }

    private static void getAnswersFromStudents(int[] array, int[] questions) {
        int countCorrectAnswers = 0, answer;
        for (int i = 0; i < array.length; i++) {
            answer = readInputNumber();
            if (answer == array[i]) {
                countCorrectAnswers++;
                questions[i]++;
            }
        }
        System.out.println(countCorrectAnswers);
        System.out.println(array.length - countCorrectAnswers);
    }

    private static void write(int[] questions, int QUESTIONS) {
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + " " + (QUESTIONS - questions[i]));
        }
    }

}
