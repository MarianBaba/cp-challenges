package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();

        if(!numbers.contains("+")) {
            System.out.println(numbers);
        } else {
            char[] temp = numbers.toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            StringBuilder sb = new StringBuilder(s);
            while(sb.charAt(0) == '+') {
                sb.deleteCharAt(0);
            }

            for(int j = 0; j < sb.length();  j += 2) {
                if(j == sb.length()-1) {
                    break;
                }
                sb.insert(j+1, '+');
            }
            System.out.println(sb);
        }
    }
}
