package P14Exercises;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int bread = Integer.parseInt(scanner.nextLine());

        double maxNumber = Double.MIN_VALUE;
        String name = "";


        for (int i = 1; i <= bread; i++) {

            String nameBread = scanner.nextLine();

            double point = 0;

            String name2 = scanner.nextLine();
            while (!name2.equals("Stop")) {
                int evaluation = Integer.parseInt(name2);


                point += evaluation;


                name2 = scanner.nextLine();

            }

            System.out.printf("%s has %.0f points.%n", nameBread, point);

            if (maxNumber < point) {
                maxNumber = point;
                name = nameBread;
                System.out.printf("%s is the new number 1!", nameBread);
            }


        }

        System.out.printf("%s won competition with %.0f points!", name, maxNumber);


    }
}
