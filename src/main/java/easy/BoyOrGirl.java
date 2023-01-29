package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoyOrGirl {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] name = br.readLine().toCharArray();
        int counter = 0;
        for(int i = 0; i< name.length; i++) {
            boolean isContained = false;
            char c = name[i];
            for(int j = i +1; j < name.length; j++) {
                if(name[j] == c) {
                    isContained = true;
                    break;
                }
            }
            if(!isContained) {
                counter++;
            }
        }
        if(counter % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

