package cc;
public class Q11 {
    public static void main(String[] args) {
        String text = "Lambda";

        Thread t1 = new Thread(() -> {
            for (char c : text.toCharArray()) {
                System.out.print(c);
            }
            System.out.println();
        });

        Thread t2 = new Thread(() -> {
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(text.charAt(i));
            }
            System.out.println();
        });

        t1.start();
        t2.start();
    }
}
