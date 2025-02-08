import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/contest/118/problem/A
 * My Submission Link: https://codeforces.com/contest/118/submission/304831548
 * Problem Number: 118A
 * Problem Name: String Task
 */

public class problem118A {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String ans = "";
        for (char ch : s.toCharArray()) {
            if (!isVowel(Character.toLowerCase(ch))) {
                ans += "." + Character.toLowerCase(ch);
            }
        }
        scan.close();
        System.out.println(ans);
    }
}