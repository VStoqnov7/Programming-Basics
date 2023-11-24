package P14Exercises;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double h1 = 0;
        double f1= 0;
        double o1 = 0;
        double ot1 = 0;



        for (int i = 0; i < n; i++) {

        String name = scanner.nextLine();

        if (name.equals("Hearthstone")){

            h1 += 1;


        } else if ( name.equals("Fornite")) {
            f1+= 1;


        } else if (name.equals("Overwatch")) {

            o1 += 1;

        }else {

            ot1 += 1;

        }



        }

        double percent1 = h1 / n * 100;
        double percent2 = f1 / n * 100;
        double percent3 = o1 / n * 100;
        double percent4 = ot1 / n * 100;


        System.out.printf("Hearthstone - %.2f%%%n",percent1);
        System.out.printf("Fornite - %.2f%%%n",percent2);
        System.out.printf("Overwatch - %.2f%%%n",percent3);
        System.out.printf("Others - %.2f%%",percent4);

    }
}
