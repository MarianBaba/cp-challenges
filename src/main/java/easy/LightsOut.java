package easy;

import java.util.Scanner;

public class LightsOut {
    //all the lights are on in the beginning
    static boolean[][] res = new boolean[3][3];
        static {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[i][j] = true;
                }
            }
        }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        // read input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = scanner.nextInt() % 2;
                if (x == 1) {
                    res[i][j] = !res[i][j];

                    if ((i - 1) >= 0) {
                        res[i - 1][j] = !res[i - 1][j];
                    }
                    if ((i + 1) <= 2) {
                        res[i + 1][j] = !res[i + 1][j];
                    }

                    if ((j - 1) >= 0) {
                        res[i][j - 1] = !res[i][j - 1];
                    }
                    if ((j + 1) <= 2) {
                        res[i][j + 1] = !res[i][j + 1];
                    }

                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (res[i][j]) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
