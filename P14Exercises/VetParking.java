package P14Exercises;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDay = Integer.parseInt(scanner.nextLine());
        int hoursStay = Integer.parseInt(scanner.nextLine());


        double price = 0;
        double totalSum = 0;


        for (double day = 1; day <= numberDay; day++) {

            if (day % 2 == 1) {
                for (double hour = 1; hour <= hoursStay; hour++) {

                    if (hour % 2 == 1) {
                        price += 1;
                        totalSum += 1;
                    } else if (hour % 2 == 0) {
                        price += 1.25;
                        totalSum += 1.25;
                    }
                }
            } else if (day % 2 == 0) {

                for (double hour1 = 1; hour1 <= hoursStay; hour1++) {

                    if (hour1 % 2 == 1) {
                        price += 2.50;
                        totalSum += 2.50;
                    }
                    if (hour1 % 2 == 0) {
                        price += 1;
                        totalSum += 1;
                    }

                }
            }
            System.out.printf("Day: %.0f - %.2f leva%n", day, price);
            price = 0;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}

