package P14Exercises;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        double maxSugar = Double.MIN_VALUE;
        double maxFlour = Double.MIN_VALUE;

        double sumSugar = 0;
        double sumFlour = 0;



        for (int i = 1; i <=number ; i++) {

            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            if (maxSugar < sugar){
            maxSugar = sugar;

            }
            if (maxFlour < flour){
            maxFlour = flour;

            }

            sumSugar += sugar;
            sumFlour += flour;




        }

        double totalSumSugar =Math.ceil( sumSugar / 950);
        double totalSumFlour =Math.ceil( sumFlour / 750);

        System.out.printf("Sugar: %.0f%n",totalSumSugar);
        System.out.printf("Flour: %.0f%n",totalSumFlour);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.",Math.ceil(maxFlour),Math.ceil(maxSugar));





    }
}
