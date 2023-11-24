package P5ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double numbers = Double.parseDouble(scanner.nextLine());

        double price = 0 ;

        switch (product){

            case "coffee":
                if (town.equals("Sofia")){
                    price = numbers * 0.50;
                } else if (town.equals("Plovdiv")) {
                    price = numbers * 0.40;
                    
                } else if (town.equals("Varna")) {
                    price = numbers * 0.45;
                    
                }
                break;
            case "water":
                if (town.equals("Sofia")){
                    price = numbers * 0.80;
                } else if (town.equals("Plovdiv")) {
                    price = numbers * 0.70;

                } else if (town.equals("Varna")) {
                    price = numbers * 0.70;
                }
                break;
            case "beer":
                if (town.equals("Sofia")){
                    price = numbers * 1.20;
                } else if (town.equals("Plovdiv")) {
                    price = numbers * 1.15;

                } else if (town.equals("Varna")) {
                    price = numbers * 1.10;

                }
                break;
            case "sweets":
                if (town.equals("Sofia")){
                    price = numbers * 1.45;
                } else if (town.equals("Plovdiv")) {
                    price = numbers * 1.30;

                } else if (town.equals("Varna")) {
                    price = numbers * 1.35;
                }
                break;

            case "peanuts":

                if (town.equals("Sofia")){
                    price = numbers * 1.60;
                } else if (town.equals("Plovdiv")) {
                    price = numbers * 1.50;

                } else if (town.equals("Varna")) {
                    price = numbers * 1.55;
                }
                break;





        }
        System.out.printf("%.2f",price);

        }

    }
