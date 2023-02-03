// package easy;

import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] soldiers = new int[n];

        for (int i = 0; i < n; i++) {
            soldiers[i] = scan.nextInt();
        }

        int x = 1, j = 2;
        int min = Math.abs(soldiers[0] - soldiers[1]);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (Math.abs(soldiers[0] - soldiers[n - 1]) < min) {
                    min = Math.abs(soldiers[0] - soldiers[n - 1]);
                    x = 1;
                    j = n;
                }
            } else if (i == n - 1) {
                if (Math.abs(soldiers[n - 1] - soldiers[0]) < min) {
                    min = Math.abs(soldiers[n - 1] - soldiers[0]);
                    x = n;
                    j = 1;
                }

                if (Math.abs(soldiers[n - 1] - soldiers[n - 2]) < min) {
                    min = Math.abs(soldiers[n - 1] - soldiers[n - 2]);
                    x = n;
                    j = n - 1;
                }
            } else {
                if (Math.abs(soldiers[i] - soldiers[i + 1]) < min) {
                    min = Math.abs(soldiers[i] - soldiers[i + 1]);
                    x = i + 1;
                    j = i + 2;
                }

                if (Math.abs(soldiers[i] - soldiers[i - 1]) < min) {
                    min = Math.abs(soldiers[i] - soldiers[i - 1]);
                    x = i + 1;
                    j = i;
                }
            }
        }
        System.out.println(x + " " + j);
    }
}