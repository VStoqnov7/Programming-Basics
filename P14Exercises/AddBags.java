package P14Exercises;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double baggageFee = Double.parseDouble(scanner.nextLine());
        double kilogramsOfBaggage = Double.parseDouble(scanner.nextLine());
        int daysUntilTravel = Integer.parseInt(scanner.nextLine());
        int numberBaggage = Integer.parseInt(scanner.nextLine());


        double luggageTax = 0;
        double finalPrice = 0;

        if (kilogramsOfBaggage < 10)
        {
            luggageTax = baggageFee * 0.20;
        }
        else if (kilogramsOfBaggage >= 10 && kilogramsOfBaggage <= 20)
        {
            luggageTax = baggageFee * 0.50;
        }
        else if (kilogramsOfBaggage > 20)
        {
            luggageTax = baggageFee;
        }

        double increase = 0;

        if (daysUntilTravel > 30)
        {
            increase = luggageTax + luggageTax * 0.10;
        }
        else if (daysUntilTravel >= 7 && daysUntilTravel <= 30)
        {
            increase = luggageTax + luggageTax * 0.15;
        }
        else if (daysUntilTravel < 7)
        {
            increase = luggageTax + luggageTax * 0.40;
        }

        finalPrice = increase * numberBaggage;

        System.out.printf("The total price of bags is: %.2f lv.", finalPrice);
    }
}
