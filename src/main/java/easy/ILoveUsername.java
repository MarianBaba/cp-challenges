package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ILoveUsername {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] p = br.readLine().split(" ");
        int f = Integer.parseInt(p[0]);
        int c = 0;
        int b = f;
        int w = f;
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(p[i]) > b) {
                c++;
                b = Integer.parseInt(p[i]);
            } else if (Integer.parseInt(p[i]) < w) {
                c++;
                w = Integer.parseInt(p[i]);
            }
        }
        System.out.println(c);
    }
}

