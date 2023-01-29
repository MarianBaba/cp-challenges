package easy;

import java.util.Scanner;

public class DimaAndFriends {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        int nFriends = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < nFriends; i++) {
            sum += scan.nextInt();
        }
        sum %= (nFriends + 1);

        int res = 5;
        for (int i = 1; i <= 5; i++) {
            if ((sum + i) % (nFriends + 1) == 1) {
                res--;
            }
        }

        System.out.println(res);
    }
}
