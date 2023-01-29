package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HQ9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.contains("Q") || s.contains("H") || s.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
