package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Четем от конзолата
        double radians = Double.parseDouble(scanner.nextLine());

        //Преобрзуваме радианите в градуси
        double degrees = radians * 180/Math.PI;

        //Принтиране на конзолата
        System.out.println(degrees);

    }



}
