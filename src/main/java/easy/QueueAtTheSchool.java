package easy;

import readers.FastReader;

import java.io.IOException;

public class QueueAtTheSchool {
    public static void main(String... args) throws IOException {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int t = fr.nextInt();

        char[] children = fr.readLine().toCharArray();

        for (int j = 0; j < t; j++) {
            for (int i = 0; i < children.length - 1; i++) {
                if (children[i] == 'B' && children[i + 1] == 'G') {
                    children[i] = 'G';
                    children[i + 1] = 'B';
                    i++;
                }
            }
        }

        for (int k = 0; k < children.length; k++) {
            System.out.print(children[k]);
        }
    }
}
