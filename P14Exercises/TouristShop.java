package P14Exercises;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String name = scanner.nextLine();

        double price = 0;
        double number = 0;

        while (!name.equals("Stop")){
            double sum = Double.parseDouble(scanner.nextLine());
            double sum1 = sum;
            number++;


            if (number % 3 == 0){
                sum1 = sum1 / 2;
            }
            price += sum1;

            if (budget < price){
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!",Math.abs(budget - price));
                break;
            }


            name = scanner.nextLine();

        }

        if (name.equals("Stop")){
            System.out.printf("You bought %.0f products for %.2f leva.",number,price);

        }

    }
}
