package P14Exercises;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String date = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());


        double sum = 0;


        switch (name){
            case "France":


                switch (date){
                    case "21-23":
                        sum = 30;

                        break;
                    case "24-27":
                        sum = 35;

                        break;
                    case "28-31":
                        sum = 40;

                        break;
                }

                break;
            case "Italy":
                switch (date){
                    case "21-23":
                        sum = 28;

                        break;
                    case "24-27":
                        sum = 32;

                        break;
                    case "28-31":
                        sum = 39;

                        break;
                }

                break;
            case "Germany":
                switch (date){
                    case "21-23":
                        sum = 32;

                        break;
                    case "24-27":
                        sum = 37;

                        break;
                    case "28-31":
                        sum = 43;

                        break;
                }

                break;
        }

        double totalSum = number * sum;
        System.out.printf("Easter trip to %s : %.2f leva.",name,totalSum);


    }
}
