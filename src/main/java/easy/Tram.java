package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stops = Integer.parseInt(br.readLine());
        int maxCapacity = 0;
        int n = 0;
        for(int i = 0; i < stops; i++) {
            String[] s  = br.readLine().split(" ");
            int exit = Integer.parseInt(s[0]);
            int enter = Integer.parseInt(s[1]);
            n -= exit;
            n += enter;
            if(n > maxCapacity) {
                maxCapacity = n;
            }
        }
        System.out.println(maxCapacity);
    }
}
