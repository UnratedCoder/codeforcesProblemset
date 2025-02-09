import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/2065/problem/A
 * My Submission Link: https://codeforces.com/contest/2065/submission/305184024
 * Problem Number: 2065A
 * Problem Name: Skibidus and Amog'u
 */

public class problem2065A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String w = scan.next();
            String ans = w.substring(0, w.length() - 2) + "i";
            System.out.println(ans);
        }
        scan.close();

    }
}