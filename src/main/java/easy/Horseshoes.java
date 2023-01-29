package easy;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Horseshoes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colors = br.readLine().split(" ");
        int counter = 0;
        for (int i = 0; i < colors.length; i++) {
            String temp = colors[i];
            for (int j = i + 1; j < colors.length; j++) {
                if (temp.equals(colors[j])) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}

