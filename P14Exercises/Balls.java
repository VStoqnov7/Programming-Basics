package P14Exercises;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());



        double red = 0;
        double orange = 0;
        double yellow = 0;
        double white = 0;
        double otherColorsPicked = 0;
        double dividesFromBlackBalls = 0;
        double allPoints = 0;

        for (int i = 1; i <= number; i++) {
        String n = scanner.nextLine();


            switch (n) {
                case "red":
                    red++;
                    allPoints += 5;

                    break;
                case "orange":
                    orange++;
                    allPoints += 10;

                    break;
                case "yellow":
                    yellow++;
                    allPoints += 15;

                    break;
                case "white":
                    white++;
                    allPoints += 20;

                    break;
                case "black":
                    dividesFromBlackBalls++;
                    allPoints = Math.floor(allPoints / 2);

                    break;
                default:
                    otherColorsPicked++;

                    break;



            }

        }


        System.out.printf("Total points: %.0f%n",allPoints);
        System.out.printf("Red balls: %.0f%n",red);
        System.out.printf("Orange balls: %.0f%n",orange);
        System.out.printf("Yellow balls: %.0f%n",yellow);
        System.out.printf("White balls: %.0f%n",white);
        System.out.printf("Other colors picked: %.0f%n",otherColorsPicked);
        System.out.printf("Divides from black balls: %.0f",dividesFromBlackBalls);



    }
}
