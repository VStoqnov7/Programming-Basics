package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class UsdToBGN {

    public static void main(String[] args) {

        //Създаваме си скенер
        Scanner scanner =  new Scanner(System.in);

        //Четене от конзолата
        double usd = Double.parseDouble(scanner.nextLine());

        //Преобразуване от долар в лева
        double bgn = usd * 1.79549;

        //Принтиране на конзалата
        System.out.println(bgn);




    }



}
