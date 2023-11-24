package P04ConditionalStatements2;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForExcursion = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double sum = numberOfPuzzles * 2.60 + talkingDolls * 3 + numberBears * 4.10 + numberMinions * 8.20 + numberTrucks * 2;
        double toys = numberOfPuzzles + talkingDolls + numberBears + numberMinions + numberTrucks;

        double discount = 0;

        if (toys >= 50) {
            discount = sum * 0.25;
        }else if ( toys < 50)
            discount = 0;
        {
        }
        double totalSum = sum - discount;
        double rent = totalSum * 0.10;
        double win = totalSum - rent;

        double remain = win - priceForExcursion;
        double remain2 = priceForExcursion - win;

        if (win >= priceForExcursion){
            System.out.printf("Yes! %.02f lv left.",remain);
        }else if (win <= priceForExcursion){
            System.out.printf("Not enough money! %.02f lv needed.",remain2);
        }


    }
}










