package module21;

public class Task5 {
    public static void main(String[] args) {
        String surname = ("Vostrikova");
        addSpace(surname);
    }

    public static void addSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i == (s.length() - 1)) {
                System.out.print(s.charAt(i));
            } else {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
