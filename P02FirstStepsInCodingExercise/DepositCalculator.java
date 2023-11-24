package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане от конзолата входните данни
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        //Пресмятаме стойността за месец
        double profitPerMonth =depositAmount * (interestRate/100)/12;

        //Пресмятаме цялата сума за всички месеци
        double totalSum = depositAmount + profitPerMonth * months;
        //Принтиране на конзалата
        System.out.println(totalSum);


    }




}
