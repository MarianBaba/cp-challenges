package easy;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int klnl = (k * l) / nl;
        int cd = c * d;
        int pnp = p / np;

        /*
        int min = klnl;
        if (cd < min) {
            min = cd;
        }
        if (pnp < min) {
            min = pnp;
        }
        */

        int min = (klnl < cd) ? ((klnl < pnp) ? klnl : (cd < pnp ? cd : pnp)) : (cd < pnp ? cd : pnp);

        System.out.println(min/n);
    }
}
