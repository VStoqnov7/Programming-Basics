package P02FirstStepsInCodingExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int costOfTrainingFor1Year = Integer.parseInt(scanner.nextLine());

        double sneakers = costOfTrainingFor1Year - (costOfTrainingFor1Year * 0.40);
        double team = sneakers - (sneakers * 0.20);
       double ball = team / 4 ;
        double accessories = ball / 5 ;
        double totalSum = costOfTrainingFor1Year + sneakers + team + ball + accessories;


        System.out.println(totalSum);


    }
}
