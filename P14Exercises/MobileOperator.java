package P14Exercises;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contract = scanner.nextLine();                    //// srok na dogovor
        String tipContract = scanner.nextLine();                  // tip dogovor
        String operator = scanner.nextLine();                     // dobaven internet
        int numberMouths = Integer.parseInt(scanner.nextLine());       // broi meseci

        double price = 0;

        switch (contract) {

            case "one":

                switch (tipContract) {
                    case "Small":
                        price = 9.98;
                        break;
                    case "Middle":
                        price = 18.99;
                        break;
                    case "Large":
                        price = 25.98;
                        break;
                    case "ExtraLarge":
                        price = 35.99;
                        break;
                }
                if (operator.equals("yes")) {
                    if (price <= 10) {
                        price += 5.50;
                    } else if (price <= 30) {
                        price += 4.35;
                    } else {
                        price += 3.85;
                    }
                }
                break;
            case "two":
                switch (tipContract) {
                    case "Small":
                        price = 8.58;
                        break;
                    case "Middle":
                        price = 17.09;
                        break;
                    case "Large":
                        price = 23.59;
                        break;
                    case "ExtraLarge":
                        price = 31.79;
                        break;
                }
                if (operator.equals("yes")) {
                    if (price <= 10) {
                        price += 5.50;
                    } else if (price <= 30) {
                        price += 4.35;
                    } else {
                        price += 3.85;
                    }
                }

                price = price - price * 0.0375;
                break;

        }

        double totalPrice = price * numberMouths;

        System.out.printf("%.2f lv.",totalPrice);


    }
}
