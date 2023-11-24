package P04ConditionalStatements2;

import java.util.Scanner;

public class Shopping_071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        int sumForVideoCard = videoCard * 250;

        double priceForProcessor = sumForVideoCard * 0.35;
        double sumForProcessor = processor * priceForProcessor;

        int priceForRam = sumForVideoCard / 10;
        int sumForRam = ramMemory * priceForRam;

        double sum = sumForVideoCard + sumForProcessor + sumForRam;
        double discount = 0 ;
        if (videoCard > processor){
          discount = sum * 0.15;

        } else if (videoCard < processor) {
            discount = 0;



        }double sumDiscount = sum - discount;
        double finalSum =Math.abs(sumDiscount - budget);

        if (sumDiscount <= budget){
            System.out.printf("You have %.02f leva left!",finalSum);


        } else if ( sumDiscount > budget) {
            System.out.printf("Not enough money! You need %.02f leva more!",finalSum);

        }

    }
}
