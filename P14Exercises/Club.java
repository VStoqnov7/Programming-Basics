package P14Exercises;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cocktail = Double.parseDouble(scanner.nextLine());

        String name = scanner.nextLine();

        double price = 0;

        while (!name.equals("Party!")) {

            int numberCocktail = Integer.parseInt(scanner.nextLine());

            double sum = 0;

            sum += numberCocktail * name.length();
            if (sum % 2 == 1) {
                sum = sum - sum * 0.25;
            }
            price += sum;
            if (price >= cocktail) {
                break;
            }
            name = scanner.nextLine();
        }

        double totalSum = Math.abs(cocktail - price);

        if (name.equals("Party!")) {

            System.out.printf("We need %.2f leva more.%n", totalSum);
            System.out.printf("Club income - %.2f leva.", price);
        } else {

            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", price);
        }


    }

}
