package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char[] chars = word.toCharArray();
        int lower = 0;
        int upper = 0;

        for (char c : chars) {
            if (c >= 65 && c <= 90) {
                upper++;
            }
            else {
                lower++;
            }
        }

        if (lower >= upper) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }
    }
}
