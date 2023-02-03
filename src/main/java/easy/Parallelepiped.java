// package easy;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int a= (int) Math.sqrt((x*y)/z);
        int b= (int) Math.sqrt((x*z)/y);
        int c= (int) Math.sqrt((y*z)/x);
        int val=(a+b+c)*4;
        System.out.print(val);
    }
}
