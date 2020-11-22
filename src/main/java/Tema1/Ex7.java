package Tema1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Change the implementation of the calculator from the previous meeting to not stop after one calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2 = sc.nextInt();
        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();
        System.out.println("De cate ori vrei sa se repete operatia?");
        int nr = sc.nextInt(),i=1;

        switch (operatie) {
            case "+": {
                int sum = 0;

                while (i <= nr) {
                    sum += (n1 + n2);
                    i++;
                }
                System.out.println("Suma numerelor este" + sum);

            }
//                System.out.println("Suma numerelor este " + (n1 + n2));
                break;
            case "-":{
                int dif = 0;

                while (i <= nr) {
                    dif -= (n1 - n2);
                    i++;
                }
                System.out.println("Diferenta numerelor este" + dif);

            }
//                System.out.println("Diferenta numerelor este " + (n1 - n2));
                break;
            case "*":{
                int pro = 0;

                while (i <= nr) {
                    pro *= (n1 * n2);
                    i++;
                }
                System.out.println("Produsul numerelor este" + pro);

            }
//                System.out.println("Produsul numerelor este " + (n1 * n2));
                break;
            case "/":{
                int imp = 0;

                while (i <= nr) {
                    imp /= (n1 / n2);
                    i++;
                }
                System.out.println(n1 + " Impartit la " + n2 + " de" + nr +"ori este" + imp);

            }
//                System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
                break;
            default:
//                System.out.println("Operatie necunoscuta");
        }
    }
}
