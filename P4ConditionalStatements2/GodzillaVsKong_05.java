package P4ConditionalStatements2;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfExtras = Integer.parseInt(scanner.nextLine());
        double clothingOfOneExtras = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double clothing = numberOfExtras * clothingOfOneExtras ;
        double discoun = 0;

        if (numberOfExtras > 150){
            discoun = clothing * 0.10;

        } else if ( numberOfExtras < 150) {
            discoun = 0;


        }
        double clothingDiscount = clothing - discoun;
        double totalSum = decor + clothingDiscount;
        double leftSum = Math.abs(budget - totalSum);

        if (totalSum > budget){
            System.out.printf("Not enough money!%n" + "Wingard needs %.02f leva more.%n",leftSum);
        } else if (totalSum <= budget) {
            System.out.printf("Action!%n" + "Wingard starts filming with %.02f leva left.%n",leftSum);

        }


    }

    }


