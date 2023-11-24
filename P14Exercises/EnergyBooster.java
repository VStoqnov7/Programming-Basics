package P14Exercises;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());


        double sum = 0;

        switch (fruit){
            case "Watermelon":
                switch (set){
                    case "small":
                        sum = 2 * 56;
                        break;
                    case "big":
                        sum = 5 * 28.70;
                        break;
                }
                sum = sum * number;
                break;
            case "Mango":
                switch (set){
                    case "small":
                        sum = 2 * 36.66;
                        break;
                    case "big":
                        sum = 5 * 19.60;
                        break;
                }
                sum = sum * number;
                break;
            case "Pineapple":
                switch (set){
                    case "small":
                        sum = 2 * 42.10;
                        break;
                    case "big":
                        sum = 5 * 24.80;
                        break;
                }
                sum = sum * number;
                break;
            case "Raspberry":
                switch (set){
                    case "small":
                        sum = 2 * 20;
                        break;
                    case "big":
                        sum = 5 * 15.20;
                        break;
                }
                sum = sum * number;
                break;
        }


        if (sum >= 400 && sum <= 1000){
            sum = sum - sum * 0.15;
        } else if (sum > 1000) {
            sum = sum - sum * 0.50;

        }


        System.out.printf("%.2f lv.",sum);



    }
}
