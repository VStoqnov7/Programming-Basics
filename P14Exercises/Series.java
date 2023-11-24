package P14Exercises;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= number ; i++) {


            String name = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            switch (name){

                case "Thrones":
                    sum = sum - sum * 0.50;
                    break;
                case "Lucifer":
                    sum = sum - sum * 0.40;
                    break;
                case "Protector":
                    sum = sum - sum * 0.30;
                    break;
                case "TotalDrama":
                    sum = sum - sum * 0.20;
                    break;
                case "Area":
                    sum = sum - sum * 0.10;
                    break;

            }

            totalSum += sum;

        }


        if (budget >= totalSum){
            System.out.printf("You bought all the series and left with %.2f lv.",budget - totalSum);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(budget - totalSum));
        }


    }
}
