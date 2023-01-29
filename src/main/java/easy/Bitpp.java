package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bitpp {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        if(len >= 1 && len <= 150) {
            int x = 0;
            for(int i = 0; i < len; i++) {
                String statement = br.readLine();
                if(statement.contains("+")) {
                    x++;
                } else {
                    x--;
                }
            }
            System.out.println(x);
        }
    }
}

