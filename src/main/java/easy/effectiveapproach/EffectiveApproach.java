package easy.effectiveapproach;

public class EffectiveApproach {
        public static void main(String[] args) {
            FastReader scanner = new FastReader();
            int n = scanner.nextInt();

            int[] a = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int[] left = new int[100005];
            int[] right = new int[1000005];
            for (int i = 0; i < n; i++) {
                left[a[i]] = i + 1;
            }
            for (int i = n - 1; i >= 0; i--) {
                right[a[i]] = n - i;
            }

            int m = scanner.nextInt();

            long ansLeft = 0;
            long ansRight = 0;
            while (m-- > 0) {
                int x = scanner.nextInt();
                ansLeft += left[x];
                ansRight += right[x];
            }
            System.out.println(ansLeft + " " + ansRight);
        }
}