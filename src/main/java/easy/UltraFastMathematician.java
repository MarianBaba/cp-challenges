package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UltraFastMathematician {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] sec = br.readLine().toCharArray();
        int[] f = new int[first.length];
        int[] s = new int[sec.length];
        int[] res = new int[first.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = first[i];
            s[i] = sec[i];
            res[i] = f[i] ^ s[i];
            System.out.print(res[i]);
        }
    }
}

