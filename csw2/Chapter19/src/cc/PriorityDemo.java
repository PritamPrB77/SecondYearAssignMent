package cc;
class AlphabetThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        AlphabetThread t1 = new AlphabetThread();
        NumberThread t2 = new NumberThread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
