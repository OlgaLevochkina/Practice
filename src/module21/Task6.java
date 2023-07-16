package module21;

public class Task6 {
    public static void main(String[] args) {
        String name = ("Anna");
        createTriangle(name);
    }

    public static void createTriangle(String s) {
        int length = 1;
        while (length <= s.length()) {
            for (int i = 0; i < length; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
            length++;
        }
    }
}
