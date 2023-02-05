// package easy;

import java.util.Scanner;
import java.util.Vector;

public class HexadecimalTheorem {
    public static void main(String... args) {
        int n = new Scanner(System.in).nextInt();

        if (n == 0) {
            System.out.println("0 0 0");
        } else if (n == 1) {
            System.out.println("0 0 1");
        } else if (n == 2) {
            System.out.println("0 1 1");
        } else if (n == 3) {
            System.out.println("1 1 1");
        } else {
            Vector<Integer> fibs = new Vector<>();
            fibs.add(0);
            fibs.add(1);

            int current = 0;
            int index = 1;

            while (current != n) {
                current = fibs.get(index - 1) + fibs.get(index);
                fibs.add(fibs.get(index - 1) + fibs.get(index));
                index++;
            }

            System.out.println(fibs.get(index - 1) + " " + fibs.get(index - 3) + " " + fibs.get(index - 4));

        }

    }
}
