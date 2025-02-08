import java.util.*;

/*
 * Problem Link: https://codeforces.com/contest/281/problem/A
 * My Submission Link: https://codeforces.com/contest/281/submission/304360538
 * Problem Number: 281A
 * Problem Name: Word Capitalization
 */

public class problem281A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        scan.close();
    }
}