package leetCode;

import java.util.Scanner;

public class YearSquareForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            String s = sc.nextLine();
            int year = Integer.parseInt(s);

            boolean found = false;

            // Try all a and b such that (a + b)^2 == year
            for (int a = 0; a <= 100; a++) {
                for (int b = 0; b <= 100; b++) {
                    int sum = a + b;
                    if (sum * sum == year) {
                        System.out.println(a + " " + b);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
