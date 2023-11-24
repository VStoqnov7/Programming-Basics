package P14Exercises;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceTennis = Double.parseDouble(scanner.nextLine());         //850
        int numberTennis = Integer.parseInt(scanner.nextLine());             //4
        int numberMar = Integer.parseInt(scanner.nextLine());               //2

        double priceRak = numberTennis * priceTennis;         //3400
        double price1Mar = priceTennis / 6;             //141.66
        double priceAllMar = numberMar * price1Mar;          //283.33
        double priceAll = (priceRak + priceAllMar) * 0.20;         // 736.66

        double totalSum = priceRak + priceAllMar + priceAll;       //4420

        double priceDj =Math.floor( totalSum / 8);
        double priceSp =Math.ceil( totalSum * 7 / 8);


        System.out.printf("Price to be paid by Djokovic %.0f%n",priceDj);
        System.out.printf("Price to be paid by sponsors %.0f",priceSp);
















    }
}
