package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerfectPermutation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        if (n % 2 == 0) {
            Integer res[] = new Integer[n];
            for (int i = 1; i < n; i += 2) {
                res[i] = i;
            }
            for (int i = 0; i < n; i += 2) {
                res[i] = i + 2;
            }
            for (Integer x : res) {
                System.out.print(x + " ");
            }
        } else {
            System.out.println("-1");
        }
    }
}

