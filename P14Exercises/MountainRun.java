package P14Exercises;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double second = Double.parseDouble(scanner.nextLine());
        double meter = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());


        double metersTime = meter * time;            ///35000
        double everyMin = Math.floor(meter / 50) * 30;         //840

        double totalTime = metersTime + everyMin;               //35840


        if (second <= totalTime){


            System.out.printf("No! He was %.2f seconds slower.",totalTime - second);

        }else {

            System.out.printf(" Yes! The new record is %.2f seconds.",totalTime);
        }














    }
}
