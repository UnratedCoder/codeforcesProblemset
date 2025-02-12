import java.util.HashMap;
import java.util.Scanner;

/*
 * Problem Link: https://codeforces.com/problemset/problem/520/A
 * My Submission Link: https://codeforces.com/contest/520/submission/305772022
 * Problem Number: 520A
 * Problem Name: Pangram
 */

public class problem520A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0) + 1);
        }
        if (map.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}