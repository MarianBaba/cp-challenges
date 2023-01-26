package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borze {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] split = input.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(".")) {
                sb.append("0");
            }
            if (split[i].equals("-")) {
                if (split[i + 1].equals("-")) {
                    sb.append("2");
                }
                else {
                    sb.append("1");
                }
                i++;
            }
        }
        System.out.println(sb);
    }
}
