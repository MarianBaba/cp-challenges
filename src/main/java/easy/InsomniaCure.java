package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsomniaCure {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pan = Integer.parseInt(br.readLine());
        int tail = Integer.parseInt(br.readLine());
        int paws = Integer.parseInt(br.readLine());
        int mom = Integer.parseInt(br.readLine());
        int total = Integer.parseInt(br.readLine());

        Integer[] dragons = new Integer[total];
        for(int i = 1; i <= total; i++) {
            dragons[i-1] = i;
            if(dragons[i-1] % pan == 0 || dragons[i-1] % tail == 0 || dragons[i-1] % paws == 0 || dragons[i-1] % mom == 0) {
                dragons[i-1] = null;
            }
        }
        int counter = 0;
        for (Integer dragon : dragons) {
            if (dragon == null) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

