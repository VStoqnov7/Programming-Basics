package P14Exercises;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String vid = scanner.nextLine();
        String way = scanner.nextLine();


        double sum = 0;


        switch (vid) {
            case "90X130":
                sum = number * 110;
                if (number > 30 && number < 60) {
                    sum = sum - sum * 0.05;
                } else if (number >= 60) {
                    sum = sum - sum * 0.08;

                }
                break;
            case "100X150":
                sum = number * 140;
                if (number > 40 && number < 80) {
                    sum = sum - sum * 0.06;
                } else if (number >= 80) {
                    sum = sum - sum * 0.10;

                }
                break;
            case "130X180":
                sum = number * 190;
                if (number > 20 && number < 50) {
                    sum = sum - sum * 0.07;
                } else if (number >= 50) {
                    sum = sum - sum * 0.12;

                }
                break;
            case "200X300":
                sum = number * 250;
                if (number > 25 && number < 50) {
                    sum = sum - sum * 0.09;
                } else if (number >= 50) {
                    sum = sum - sum * 0.14;

                }
                break;
        }


        switch (way) {
            case "With delivery":
                sum = sum + 60;
                break;
            case "Without delivery":
                sum = sum;
                break;

        }

        if (number >= 99) {
            sum = sum - sum * 0.04;
        }


        if (number <= 10){
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN",sum);
        }


    }
}
