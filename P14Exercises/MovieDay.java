package P14Exercises;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int timeForPicture = Integer.parseInt(scanner.nextLine());
        int numberScene = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());


        double ter = timeForPicture * 0.15;

        double timeScene = numberScene * timeForScene;

        double neededTime = ter + timeScene;


        if (neededTime <= timeForPicture){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timeForPicture - neededTime);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",Math.abs(timeForPicture - neededTime));
        }



    }
}
