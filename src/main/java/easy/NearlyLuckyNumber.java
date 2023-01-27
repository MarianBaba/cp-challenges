package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyLuckyNumber {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] digits = br.readLine().toCharArray();

        int luckyDigits = 0;
        for (char c : digits) {
            if (c == '4' || c == '7') {
                luckyDigits++;
            }
        }

        String s = Integer.valueOf(luckyDigits).toString();
        char[] res = s.toCharArray();
        boolean flag = true;

        for (char resc : res) {
            if (resc != '4' && resc != '7') {
                System.out.println("NO");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        }

    }
}
