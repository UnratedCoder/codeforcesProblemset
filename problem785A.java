import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/problemset/problem/785/A
 * My Submission Link: https://codeforces.com/contest/785/submission/305915293
 * Problem Number: 785A
 * Problem Name: Anton and Polyhedrons
 */

public class problem785A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while (n-- > 0) {
            String s = scan.next();
            if (s.startsWith("T")) {
                sum += 4;
            } else if (s.startsWith("C")) {
                sum += 6;
            } else if (s.startsWith("O")) {
                sum += 8;
            } else if (s.startsWith("D")) {
                sum += 12;
            } else {
                sum += 20;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}