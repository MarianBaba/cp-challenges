package easy;

import java.util.Scanner;

public class PanoramixPrediction {

    public static int nextPrime(int x) {
        int candidate = ++x;
        boolean found = false;

        while (!found) {
            boolean isPrime = true;
            for (int i = 2; i < candidate; i++) {
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                found = true;
            } else {
                candidate++;
            }
        }
        return candidate;
    }

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int nextPrime = nextPrime(n);

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
