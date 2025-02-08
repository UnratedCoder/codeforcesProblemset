import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/59/problem/A
 * My Submission Link: https://codeforces.com/contest/59/submission/304955829
 * Problem Number: 59A
 * Problem Name: Word
 */

public class problem59A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int cap = 0;
        int low = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                low++;
            } else {
                cap++;
            }
        }
        if (cap > low) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        scan.close();
    }
}
