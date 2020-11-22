package Tema1.HackerRank;

import java.util.Scanner;

public class JavaLoopII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0 ; j < n ; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.println(a+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
