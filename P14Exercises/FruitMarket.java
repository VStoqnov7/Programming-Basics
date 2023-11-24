package P14Exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());      // qgodi cena
        double banana = Double.parseDouble(scanner.nextLine());
        double orange = Double.parseDouble(scanner.nextLine());
        double resp = Double.parseDouble(scanner.nextLine());
        double strawberriesKilo = Double.parseDouble(scanner.nextLine());



        double priceResp = priceStrawberries / 2;                  /// malini cena
        double priceOrange = priceResp - priceResp * 0.40;         // portokali cena
        double priceBanana =  priceResp - priceResp * 0.80;         // banani cena


        double totalSum = (priceStrawberries * strawberriesKilo) + (banana * priceBanana) + (orange * priceOrange) + (resp * priceResp);


        System.out.printf("%.2f",totalSum);

    }
}
