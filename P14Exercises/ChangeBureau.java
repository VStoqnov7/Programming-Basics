package P14Exercises;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double china = Double.parseDouble(scanner.nextLine());
        double com = Double.parseDouble(scanner.nextLine());


        double priceBitcoin = bitcoin * 1168;          //1168 leva
        double priceChina = china * 0.15;           //0.75 dolara
        double euro = 1.95;
        double priceDollar = priceChina * 1.76;       //1.32 leva


        double sum = priceBitcoin + priceDollar;        /// 1169.32



        double totalSum = sum / 1.95;          //599.65



        double priceCom = com / 100;

        double totalTotal = totalSum - totalSum * priceCom;


        System.out.printf("%.2f",totalTotal);











    }
}
