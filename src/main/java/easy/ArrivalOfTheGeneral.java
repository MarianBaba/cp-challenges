package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sold = br.readLine().split(" ");
        Integer[] s = new Integer[n];
        for (int i = 0; i < sold.length; i++) {
            s[i] = Integer.parseInt(sold[i]);
        }
        int min = s[0];
        int max = s[0];
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] <= min) {
                min = s[i];
                minPos = i;
            } else if (s[i] > max) {
                max = s[i];
                maxPos = i;
            }
        }
        int x = s.length - 1 - minPos;
        if (maxPos < minPos) {
            System.out.println(maxPos + x);
        } else {
            System.out.println(maxPos - 1 + x);
        }
    }
}

