import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/71/problem/A
 * My Submission Link: https://codeforces.com/contest/71/submission/304230210
 * Problem Number: 71A
 * Problem Name: Way Too Long Words
 */

public class problem71A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            String s = scan.next();
            if (s.length() > 10) {
                System.out.println(s.charAt(0) + "" + (s.length() - 2) + "" + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
        scan.close();
    }
}