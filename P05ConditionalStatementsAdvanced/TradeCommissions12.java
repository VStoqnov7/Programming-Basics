package P05ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (town) {
            case "Sofia":
                if (volume >= 0 && volume <= 500) {
                    price = volume * 0.05;
                    System.out.printf("%.2f", price);
                } else if (volume > 500 && volume <= 1000) {
                    price = volume * 0.07;
                    System.out.printf("%.2f", price);

                } else if (volume > 1000 && volume <= 10000) {
                    price = volume * 0.08;
                    System.out.printf("%.2f", price);

                } else if (volume > 10000) {
                    price = volume * 0.12;
                    System.out.printf("%.2f", price);

                }else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volume >= 0 && volume <= 500) {
                    price = volume * 0.045;
                    System.out.printf("%.2f", price);
                } else if (volume > 500 && volume <= 1000) {
                    price = volume * 0.075;
                    System.out.printf("%.2f", price);

                } else if (volume > 1000 && volume <= 10000) {
                    price = volume * 0.10;
                    System.out.printf("%.2f", price);

                } else if (volume > 10000) {
                    price = volume * 0.13;
                    System.out.printf("%.2f", price);

                }else {
                    System.out.println("error");
                }
                break;

            case "Plovdiv":
                if (volume >= 0 && volume <= 500) {
                    price = volume * 0.055;
                    System.out.printf("%.2f", price);
                } else if (volume > 500 && volume <= 1000) {
                    price = volume * 0.08;
                    System.out.printf("%.2f", price);

                } else if (volume > 1000 && volume <= 10000) {
                    price = volume * 0.12;
                    System.out.printf("%.2f", price);

                } else if (volume > 10000) {
                    price = volume * 0.145;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;

            default:
                System.out.println("error");
                break;
        }

    }

}