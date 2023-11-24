package P14Exercises;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String country = scanner.nextLine();
        String appliance = scanner.nextLine();


        double sum = 0;

        switch (country){

            case "Russia":
                switch (appliance){
                    case "ribbon":
                        sum = 9.100 + 9.400;
                        break;
                    case "hoop":
                        sum = 9.300 + 9.800;

                        break;
                    case "rope":
                        sum = 9.600 + 9.000;
                        break;
                }
                break;
            case "Bulgaria":
                switch (appliance){
                    case "ribbon":
                        sum = 9.600 + 9.400;
                        break;
                    case "hoop":
                        sum = 9.550 + 9.750;

                        break;
                    case "rope":
                        sum = 9.500 + 9.400;
                        break;
                }
                break;
            case "Italy":
                switch (appliance){
                    case "ribbon":
                        sum = 9.200 + 9.500;
                        break;
                    case "hoop":
                        sum = 9.450 + 9.350;

                        break;
                    case "rope":
                        sum = 9.700 + 9.150;
                        break;
                }
                break;
        }

        double totalSum = 20 - sum;

        double total = totalSum / 20 * 100;


        System.out.printf("The team of %s get %.3f on %s.%n",country,sum,appliance);
        System.out.printf("%.2f%%",total);




    }
}
