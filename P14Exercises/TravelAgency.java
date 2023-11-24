package P14Exercises;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String paket = scanner.nextLine();
        String yesOrNo = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (text) {
            case "Bansko":
            case "Borovets":

                switch (paket) {
                    case "withEquipment":

                        price = 100;

                        if (yesOrNo.equals("yes")) {

                            price = price - price * 0.10;

                        } else if (yesOrNo.equals("no")) {
                            price += 0;

                        }
                        if (day >= 7) {
                            price -= price / day;
                        }
                        if (day > 0) {
                            System.out.printf("The price is %.2flv! Have a nice time!", price * day);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    case "noEquipment":
                        price = 80;
                        if (yesOrNo.equals("yes")) {
                            price = price - price * 0.05;
                        } else if (yesOrNo.equals("no")) {
                            price += 0;

                        }
                        if (day >= 7) {
                            price -= price / day;
                        }
                        if (day > 0) {
                            System.out.printf("The price is %.2flv! Have a nice time!", price * day);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                break;
            case "Varna":
            case "Burgas":
                switch (paket) {
                    case "withBreakfast":
                        price += 130;
                        if (yesOrNo.equals("yes")) {
                            price = price - price * 0.12;
                        } else if (yesOrNo.equals("no")) {
                            price += 0;
                        }
                        if (day >= 7) {
                            price -= price / day;
                        }
                        if (day > 0) {
                            System.out.printf("The price is %.2flv! Have a nice time!", price * day);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    case "noBreakfast":
                        price = 100;
                        if (yesOrNo.equals("yes")) {
                            price = price - price * 0.07;

                        } else if (yesOrNo.equals("no")) {
                            price += 0;
                        }
                        if (day >= 7) {
                            price -= price / day;
                        }
                        if (day > 0) {
                            System.out.printf("The price is %.2flv! Have a nice time!", price * day);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}