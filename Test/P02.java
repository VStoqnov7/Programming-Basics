package Test;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTShirt = Double.parseDouble(scanner.nextLine());
        double sumBall = Double.parseDouble(scanner.nextLine());




        double priceShort = priceTShirt * 0.75;         //18.75
        double priceSocks = priceShort * 0.20;          //3.75
        double priceButtons = (priceTShirt + priceShort) * 2;         //87.5
        double sum = priceTShirt + priceShort + priceSocks + priceButtons ;     //135
        double percent =  sum - sum * 0.15;                                   //114.75

        if (percent > sumBall){

            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",percent);


        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",Math.abs(percent - sumBall));



        }
















    }
}
