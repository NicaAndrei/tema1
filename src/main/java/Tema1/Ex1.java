package Tema1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Calculate the sum of the first 100 prime numbers");
        int sum = 0, nr = 0, i = 2;
        while (nr <= 100) {
            int ct = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    ct++;
                }
            }
            if (ct == 0) {
                sum += i;
                nr++;
            }
            i++;

        }
        System.out.println("Sum of the first 100 prime numbers is " + sum);
    }

}
