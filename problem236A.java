import java.util.*;

/*
 * Problem Link: https://codeforces.com/contest/236/problem/A
 * My Submission Link: https://codeforces.com/contest/236/submission/304592111
 * Problem Number: 236A
 * Problem Name: Boy or Girl
 */

public class problem236A {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        HashSet<Character> set = new HashSet<>();
        for (char ch : username.toCharArray()) {
            set.add(ch);
        }
        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        scan.close();
    }
}