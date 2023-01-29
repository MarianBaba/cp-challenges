package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PetyaAndStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine().toLowerCase();
        String second = br.readLine().toLowerCase();

        if(first.length() <= 100 && first.length() >= 1) {
            if(first.equals(second)) {
                System.out.println(0);
            } else {
                for(int i = 0; i < first.length(); i++) {
                    if(first.charAt(i) == second.charAt(i)) {
                        continue;
                    } else {
                        if(first.charAt(i) < second.charAt(i)) {
                            System.out.println(-1);
                            break;
                        } else {
                            System.out.println(1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
