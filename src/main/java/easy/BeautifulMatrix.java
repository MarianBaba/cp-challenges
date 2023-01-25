package easy;

import readers.FastReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulMatrix {
    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        String[][] chara = new String[5][5];
        for(int i = 0; i < 5; i++) {
            String[] row = fr.readLine().trim().split(" ");
            for(int j = 0; j < 5; j++) {
                chara[i][j] = row[j];
            }
        }
        int row = 0;
        int col = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(chara[i][j].equals("1")) {
                    row = i+1;
                    col = j+1;
                }
            }
        }
        int res = (Math.abs(3 - row) + Math.abs(3 - col));
        System.out.println(res);
    }
}