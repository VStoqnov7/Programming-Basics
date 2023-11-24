package P14Exercises;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String egg = scanner.nextLine();
        String paintEgg = scanner.nextLine();
        int part = Integer.parseInt(scanner.nextLine());


        double sum = 0;


        switch (egg){
            case "Large":

                switch (paintEgg){
                    case "Red":
                        sum = 16;
                        break;
                    case "Green":
                        sum = 12;
                        break;
                    case "Yellow":
                        sum = 9;
                        break;

                }
                break;
            case "Medium":
                switch (paintEgg){
                    case "Red":
                        sum = 13;
                        break;
                    case "Green":
                        sum = 9;
                        break;
                    case "Yellow":
                        sum = 7;
                        break;

                }

                break;
            case "Small":
                switch (paintEgg){
                    case "Red":
                        sum = 9;
                        break;
                    case "Green":
                        sum = 8;
                        break;
                    case "Yellow":
                        sum = 5;
                        break;

                }
                break;
        }

        double totalSum = part * sum;



        double priceSum = totalSum * 35 / 100;
        double total = totalSum - priceSum;

        System.out.printf("%.2f leva.",total);



    }
}
