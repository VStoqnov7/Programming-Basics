package P14Exercises;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double drinkPrice = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    drinkPrice = (drinksCount * 0.90) * 0.65;
                }
                else if (sugar.equals("Normal")) {
                    drinkPrice = drinksCount * 1.00;
                }
                else if (sugar.equals("Extra")) {
                    drinkPrice = drinksCount * 1.20;
                }

                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    drinkPrice = (drinksCount * 1.00) * 0.65;
                }
                else if (sugar.equals("Normal")) {
                    drinkPrice = drinksCount * 1.20;
                }
                else if (sugar.equals("Extra")) {
                    drinkPrice = drinksCount * 1.60;
                }

                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    drinkPrice = (drinksCount * 0.50) * 0.65;
                }
                else if (sugar.equals("Normal")) {
                    drinkPrice = drinksCount * 0.60;
                }
                else if (sugar.equals("Extra")) {
                    drinkPrice = drinksCount * 0.70;
                }

                break;
            default:
                break;
        }

        if (drink.equals("Espresso") && drinksCount >= 5) {
            drinkPrice = drinkPrice * 0.75;
        }

        if (drinkPrice > 15) {
            drinkPrice = drinkPrice * 0.80;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.",drinksCount,drink,drinkPrice);
    }

    public static class Pool {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int v = Integer.parseInt(scanner.nextLine());
            int p1 = Integer.parseInt(scanner.nextLine());
            int p2 = Integer.parseInt(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());


            double p11 = p1 * h;
            double p21 = p2 * h;
            double debitFor1House = p11 + p21;
            double debitOff = debitFor1House * 100 / 1000 ;
            double first = (debitFor1House - p21 ) * 100 / debitFor1House;
            double two = (debitFor1House - p11 ) * 100 / debitFor1House;
            double total = v - debitFor1House;
            double total1 = Math.abs(total);


            if (v >= debitFor1House){
                System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", debitOff,first,two);
            } else if ( v < debitFor1House) {
                System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,total1);

            }
        }

        public static class ExcellentResult {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int grade = Integer.parseInt(scanner.nextLine());

                //  ако оценката е 5 или по-висока

                if (grade >= 5){
                    System.out.println("Excellent!");

                }

            }
        }
    }

    public static class Class {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int number = Integer.parseInt(scanner.nextLine());
            int number1 = Integer.parseInt(scanner.nextLine());
            String name = "Yuliyan";
            char symbol = 'a';


            // +, -, *, /, %

            double result = number + number1;

            System.out.println(result);



        }
    }
}
