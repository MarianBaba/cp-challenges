// package easy;

import java.util.Scanner;

public class PetrAndBook {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int pages = scanner.nextInt();
        int[] days = new int[7];
        int res = 0;

        for (int i = 0; i < days.length; i++) {
            days[i] = scanner.nextInt();
        }
        while (pages > 0) {
            for (int j = 0; j < days.length; j++) {
                pages -= days[j];
                if (pages <= 0) {
                    res = j + 1;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
