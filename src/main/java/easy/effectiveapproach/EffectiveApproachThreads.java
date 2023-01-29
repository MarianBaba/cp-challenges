package easy.effectiveapproach;

import java.io.IOException;

public class EffectiveApproachThreads {

    public static void headToTail(int[] arr, int goal) {
        int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            counter++;
            if (arr[j] == goal) {
                break;
            }
        }
        counterHeadToTail += counter;
    }

    public static void tailToHead(int[] arr, int goal) {
        int counter = 0;
        for (int k = arr.length - 1; k >= 0; k--) {
            counter++;
            if (arr[k] == goal) {
                break;
            }
        }
        counterTailToHead += counter;
    }

    public static int counterHeadToTail = 0;
    public static int counterTailToHead = 0;

    public static void main(String... args) throws IOException, InterruptedException {
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        int m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            int toLookFor = scan.nextInt();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //headToTail(nums, toLookFor);
                    int counter = 0;
                    for (int j = 0; j < nums.length; j++) {
                        counter++;
                        if (nums[j] == toLookFor) {
                            break;
                        }
                    }
                    counterHeadToTail += counter;
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //tailToHead(nums, toLookFor);
                    int counter = 0;
                    for (int k = nums.length - 1; k >= 0; k--) {
                        counter++;
                        if (nums[k] == toLookFor) {
                            break;
                        }
                    }
                    counterTailToHead += counter;
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
        System.out.println(counterHeadToTail + " " + counterTailToHead);
    }
}