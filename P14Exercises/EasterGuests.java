package P14Exercises;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());



        double numberBread = Math.ceil(1.0 * people / 3);
        double numberEgg = 1.0 * people * 2;

        double priceForBread = 4 * numberBread;
        double priceForEgg = numberEgg * 0.45;



        double sum = priceForBread + priceForEgg;


        if (sum > budget){

            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",Math.abs(budget - sum));


        }else {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",numberBread,numberEgg);
            System.out.printf("He has %.2f lv. left.",budget - sum);
        }





    }
}
