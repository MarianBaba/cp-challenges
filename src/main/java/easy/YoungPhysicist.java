package easy;

import readers.FastReader;

public class YoungPhysicist {
    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        Integer rows = Integer.parseInt(fr.readLine());
        int firstCol = 0;
        int secondCol = 0;
        int thirdCol = 0;
        for (int i = 0; i < rows; i++) {
            String[] row = fr.readLine().split(" ");
            firstCol += Integer.parseInt(row[0]);
            secondCol += Integer.parseInt(row[1]);
            thirdCol += Integer.parseInt(row[2]);
        }
        if (firstCol == 0 && secondCol == 0 && thirdCol == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
