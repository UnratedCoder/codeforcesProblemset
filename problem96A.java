import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/96/problem/A
 * My Submission Link: https://codeforces.com/contest/96/submission/305062011
 * Problem Number: 96A
 * Problem Name: Football
 */

public class problem96A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int max = Integer.MIN_VALUE;
        int count = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == prev) {
                count++;
            } else {
                count = 1;
                prev = ch;
            }
            max = Math.max(max, count);
        }
        if (max >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}