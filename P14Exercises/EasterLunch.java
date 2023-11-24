package P14Exercises;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int easterBread = Integer.parseInt(scanner.nextLine());              /// kozunak
        int numberEgg = Integer.parseInt(scanner.nextLine());
        int kiloCookies = Integer.parseInt(scanner.nextLine());



        double priceEasterBread = easterBread * 3.20;
        double priceForEgg = numberEgg * 4.35;
        double  priceCookies = kiloCookies * 5.40;

        double priceEgg = numberEgg * 12 * 0.15;




        double totalSum = priceEasterBread + priceForEgg + priceCookies + priceEgg;


        System.out.printf("%.2f",totalSum);


    }
}
