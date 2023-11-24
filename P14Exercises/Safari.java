package P14Exercises;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        double gas = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double priceGas = gas * 2.10;                     //21
        double tourGuide  = priceGas + 100;                      //121



        switch (day){
            case "Saturday":
                tourGuide = tourGuide - tourGuide * 0.10;
                break;
            case "Sunday":
                tourGuide = tourGuide - tourGuide * 0.20;
                break;
        }


        if (budget > tourGuide){
            System.out.printf("Safari time! Money left: %.2f lv. ",budget-tourGuide);

        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",Math.abs(budget-tourGuide));
            
        }

    }
}
