package P14Exercises;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        double totalSumProduct = 0;


        for (int i = 1; i <= number; i++) {

        String input = scanner.nextLine();

        double numberProduct = 0;

        double sum = 0;

            while (!input.equals("Finish")) {

                switch (input){
                    case "basket":
                        sum += 1.50;
                        numberProduct++;

                        break;
                    case "wreath":
                        sum += 3.80;
                        numberProduct++;
                        break;
                    case "chocolate bunny":
                        sum += 7;
                        numberProduct++;
                        break;
                }




                input = scanner.nextLine();

            }
                if (numberProduct % 2 == 0){
                    sum = sum - sum * 0.20;
                }
                totalSumProduct += sum;

            System.out.printf("You purchased %.0f items for %.2f leva.%n",numberProduct,sum);


        }

        double totalSum = totalSumProduct / number;
        System.out.printf("Average bill per client is: %.2f leva.",totalSum);


    }
}
