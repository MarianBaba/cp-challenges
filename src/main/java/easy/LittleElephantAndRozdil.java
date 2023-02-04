package easy;

import java.util.Scanner;

public class LittleElephantAndRozdil {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        int min = Integer.MAX_VALUE;
        int counter = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if(x < min) {
                min = x;
                index = i + 1;
            }
            nums[i] = x;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                counter++;
            }
        }

        if (counter < 2) {
            System.out.println(index);
        } else {
            System.out.println("Still Rozdil");
        }
    }
}
