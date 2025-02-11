import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/problemset/problem/41/A
 * My Submission Link: https://codeforces.com/contest/41/submission/305558894
 * Problem Number: 41A
 * Problem Name: Translation
 */

public class problem41A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        scan.close();
        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(s.length() - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}