import java.util.Scanner;

public class problem734A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int anthonWin = 0;
        int danikWin = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                anthonWin++;
            } else {
                danikWin++;
            }
        }
        if (anthonWin > danikWin) {
            System.out.println("Anton");
        } else if (anthonWin < danikWin) {
            System.out.println("Danik");
        } else {

            System.out.println("Friendship");
        }
        scan.close();
    }
}