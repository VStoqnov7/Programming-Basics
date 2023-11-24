package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNylon =  (nylon + 2) * 1.50 ;
        double pricePaint = ( paint * 0.10 + paint )* 14.50;
        double priceThinner = thinner * 5.00;
        double priceBags = 0.40;
        double totalPrice = priceNylon + pricePaint + priceThinner + priceBags;
        double finalPriceMaster = (totalPrice * 0.30) * hours;
        double finalSum = totalPrice + finalPriceMaster;






        System.out.println(finalSum);



    }
}
