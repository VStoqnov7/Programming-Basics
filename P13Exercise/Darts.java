package P13Exercise;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int totalPoints = 301;
        int successfulShots = 0;
        int unSuccessfulShots = 0;

        while (totalPoints != 0) {
            String area = scanner.nextLine();
            if ("Retire".equals(area)) {
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());

            if ("Triple".equals(area)) {
                points *= 3;
            } else if ("Double".equals(area)) {
                points *= 2;
            }

            if (totalPoints - points >= 0) {
                totalPoints -= points;
                successfulShots++;
            } else {
                unSuccessfulShots++;
            }
        }

        if (totalPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unSuccessfulShots);
        }
    }
}