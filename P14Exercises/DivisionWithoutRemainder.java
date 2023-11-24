package P14Exercises;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        double p1 = 0;
        double p2 = 0;
        double p3 = 0;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                p1++;

            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;

            }


        }
        double p11 = p1 / n * 100;
        double p22 = p2 / n * 100;
        double p33 = p3 / n * 100;

        System.out.printf("%.2f%%%n",p11);
        System.out.printf("%.2f%%%n",p22);
        System.out.printf("%.2f%%",p33);
    }
}
