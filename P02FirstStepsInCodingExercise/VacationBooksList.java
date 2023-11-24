package P02FirstStepsInCodingExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numberOfPage = Integer.parseInt(scanner.nextLine());
        int pageFor1Hour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = numberOfPage / pageFor1Hour;
        int needHoursForDay = totalReadingTime / numberOfDays;

        System.out.println(needHoursForDay);
    }
}
