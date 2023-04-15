package module12;

public class Task12a {
    public static void main(String[] args) {
        int min = 1, max = 12;
        int winterBorn = 0, springBorn = 0, summerBorn = 0, autumnBorn = 0;
        for (int i = 0; i < 1234; i++) {
            int randomMonth = min + (int) ((max - min + 1) * Math.random());
            if (randomMonth == 12 || randomMonth == 1 || randomMonth == 2) {
                winterBorn++;
            } else if (randomMonth >= 3 && randomMonth <= 5) {
                springBorn++;
            } else if (randomMonth >= 6 && randomMonth <= 8) {
                summerBorn++;
            } else {
                autumnBorn++;
            }
        }
        System.out.println(winterBorn + " kid(s) were born in winter");
        System.out.println(springBorn + " kid(s) were born in spring");
        System.out.println(summerBorn + " kid(s) were born in summer");
        System.out.println(autumnBorn + " kid(s) were born in autumn");
    }
}
