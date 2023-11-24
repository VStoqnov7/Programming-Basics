package P14Exercises;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        String nameBest = "";
        int bestGoals = Integer.MIN_VALUE;




        while (!input.equals("END")){

            int goals = Integer.parseInt(scanner.nextLine());

            if (bestGoals < goals){
                nameBest = input;
                bestGoals = goals;

            }

            if (bestGoals >= 10){
               break;
            }



            input = scanner.nextLine();
        }

            System.out.printf("%s is the best player!%n",nameBest);



        if (bestGoals >= 3){

            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestGoals);

        }else {
            System.out.printf("He has scored %d goals.",bestGoals);

        }



    }
}
