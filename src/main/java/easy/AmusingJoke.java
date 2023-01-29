package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AmusingJoke {

    public static void main(String... strings) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] n1 = br.readLine().toCharArray();
        char[] n2 = br.readLine().toCharArray();
        char[] shuff = br.readLine().toCharArray();

        if (shuff.length < n1.length + n2.length) {
            System.out.println("NO");
        } else {
            Arrays.sort(n1);
            Arrays.sort(n2);
            Arrays.sort(shuff);

            int counter = n1.length + n2.length;

            boolean missing = false;

            for (int i = 0; i < n1.length; i++) {
                char x = n1[i];
                boolean found = false;
                for (int j = 0; j < shuff.length; j++) {
                    if (x == shuff[j]) {
                        found = true;
                        shuff[j] = ' ';
                        counter--;
                        break;
                    }
                }
                if (!found) {
                    missing = true;
                }
            }

            if (missing) {
                System.out.println("NO");
                return;
            }

            for (int i = 0; i < n2.length; i++) {
                char x = n2[i];
                boolean found = false;
                for (int j = 0; j < shuff.length; j++) {
                    if (x == shuff[j]) {
                        found = true;
                        shuff[j] = ' ';
                        counter--;
                        break;
                    }
                }
                if (!found) {
                    missing = true;
                }
            }

            if (missing) {
                System.out.println("NO");
                return;
            }

            boolean isEmpty = true;

            for (char x : shuff) {
                if (x != ' ') {
                    isEmpty = false;
                }
            }

            if (counter == 0 && isEmpty) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

