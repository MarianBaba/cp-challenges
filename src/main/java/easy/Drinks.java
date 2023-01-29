package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drinks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double d = Double.parseDouble(br.readLine());
        String[] drinks = br.readLine().split(" ");
        int sum = 0;
        for (String drink : drinks) {
            sum += Integer.parseInt(drink);
        }
        System.out.println(sum / d);
    }
}

