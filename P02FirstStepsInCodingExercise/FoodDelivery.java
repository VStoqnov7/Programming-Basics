package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVegetarianMenu = vegetarianMenu * 8.15;
        double priceDelivery = 2.50;

        double totalPrice = ( priceChickenMenu + priceFishMenu + priceVegetarianMenu );
        double deserts = totalPrice * 0.20;
        double finalSum = totalPrice + deserts + priceDelivery;

        System.out.println(finalSum);

    }

}
