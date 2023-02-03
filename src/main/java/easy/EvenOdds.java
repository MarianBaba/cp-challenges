package easy;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        long m = scan.nextLong();

        // if (n % 2 == 0) {
            if (m > n / 2) {
                // parte seconda dell'array (numero pari), numeri totali pari

                m = m % (n/2);

                // System.out.println(n + " " + m);

                int counter = 0;
                for (int i = 2; i <= n; i++) {
                    if (i % 2 == 0) {
                        counter++;
                        if (counter == m) {
                            System.out.println(i);
                            break;
                        }
                    }
                }

            } else {
                // parte prima dell'array (numeri dispari), numeri totali pari
                int counter = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        counter++;
                        if (counter == m) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        // }

        /* else {
            if (m > ((n / 2) + 1)) {
                // parte seconda dell'array (numeri pari), numeri totali dispari
                m = m % (n / 2);
                int counter = 0;
                for (int i = 2; i <= n; i++) {
                    if (i % 2 == 0) {
                        counter++;
                        if (counter == m) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            } else {
                // parte prima dell'array (numeri pari), numeri totali dispari

            }
        }
        */


    }
}
