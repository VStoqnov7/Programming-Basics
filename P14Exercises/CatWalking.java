package P14Exercises;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int min = Integer.parseInt(scanner.nextLine());
        int walkingDay = Integer.parseInt(scanner.nextLine());
        int calorie = Integer.parseInt(scanner.nextLine());



        double minutes = min * walkingDay;              //90
        double totalCalorie = minutes * 5;            ////450

        double percent = calorie * 0.50;             //300



        if (totalCalorie >= percent){

            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.",totalCalorie);


        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",totalCalorie);


        }


    }
}
