package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulYear {
    public static boolean checkSolution(String year) {
        String[] digits = year.split("");
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i].equals(digits[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean found = false;

        Integer y = Integer.valueOf(br.readLine());
        while (!found) {
            y++;
            if (checkSolution(y.toString())) {
                found = true;
            }
        }
        System.out.println(y);
    }
}