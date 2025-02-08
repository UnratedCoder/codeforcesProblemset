import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/112/problem/A
 * My Submission Link: https://codeforces.com/contest/112/submission/304656979
 * Problem Number: 112A
 * Problem Name: Petya and Strings
 */

public class problem112A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(-1);
        } else if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scan.close();

    }
}