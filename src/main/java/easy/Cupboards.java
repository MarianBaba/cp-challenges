package easy;

import java.util.Scanner;

public class Cupboards {
    public static int lookFor1Right(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor0Right(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor1Left(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor0Left(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String... strings) throws Exception {
        Scanner fr = new Scanner(System.in);
        int n = fr.nextInt();
        int[][] arr = new int[n][2];

        int countLeft = 0;
        int countRight = 0;
        int sec = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = fr.nextInt();
                if (j == 0 && arr[i][j] == 0) {
                    countLeft++;
                }
                if (j == 1 && arr[i][j] == 0) {
                    countRight++;
                }
            }
        }

        if (countLeft == n || countLeft == 0) {
            if (countRight == n || countRight == 0) {
            } else {
                if (countRight > n / 2) {
                    sec += lookFor1Right(arr, n);
                } else {
                    sec += lookFor0Right(arr, n);
                }
            }
        } else {
            if (countLeft > n / 2) {
                sec += lookFor1Left(arr, n);
                if (countRight == n || countRight == 0) {
                    // do nothing
                } else {
                    if (countRight > n / 2) {
                        sec += lookFor1Right(arr, n);
                    } else {
                        sec += lookFor0Right(arr, n);
                    }
                }
            } else {
                sec += lookFor0Left(arr, n);
                if (countRight == n || countRight == 0) {
                    // do nothing
                } else {
                    if (countRight > n / 2) {
                        sec += lookFor1Right(arr, n);
                    } else {
                        sec += lookFor0Right(arr, n);
                    }
                }
            }
        }
        System.out.println(sec);
    }
}
