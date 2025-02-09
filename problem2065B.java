import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/2065/problem/B
 * My Submission Link: https://codeforces.com/contest/2065/submission/305204770
 * Problem Number: 2065B
 * Problem Name: Skibidus and Ohio
 */

public class problem2065B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int countEqual = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    countEqual++;
                }
            }
            if (countEqual >= 1) {
                System.out.println(1);
            } else {
                System.out.println(s.length());
            }
        }
        scan.close();
    }
}