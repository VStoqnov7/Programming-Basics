package P14Exercises;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        if (number >= 10 && number <= 15){

            sum = sum - sum * 0.15;
            

        } else if (number > 15 && number <= 20) {
            sum = sum - sum * 0.20;
            
        }else if (number > 20){
            sum = sum - sum * 0.25;
        }else {
            sum = sum;
        }



        double cake = 10 * budget / 100;

        double totalSum = number * sum + cake ;
        double totalSum2 = budget - totalSum;

        if (totalSum <= budget){
            System.out.printf("It is party time! %.2f leva left.",Math.abs(totalSum2));

        } else {

            System.out.printf("No party! %.2f leva needed.",Math.abs(totalSum2));

        }


    }
}
