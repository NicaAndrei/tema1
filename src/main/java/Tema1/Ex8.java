package Tema1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Calculate and display the factorial of a given number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),f=1;
        while (n != 0){
            f*=n;
            n-=1;

        }
        System.out.println("Factorial of the number is " + f);
    }
}
