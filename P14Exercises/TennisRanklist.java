package P14Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int point = Integer.parseInt(scanner.nextLine());

        double sumPoints = 0;
        double win = 0;


        for (int i = 1; i <= number ; i++) {
            String text = scanner.nextLine();



            switch (text){
                case "W":
                    sumPoints += 2000;
                    win++;
                    break;
                case "F":
                    sumPoints += 1200;
                    break;
                case "SF":
                    sumPoints += 720;
                    break;

            }


        }

        double sr =Math.floor( sumPoints / number);


            double sum = sumPoints + point;
            double winPercent = win / number * 100;


            System.out.printf("Final points: %.0f%n",sum);
            System.out.printf("Average points: %.0f%n",sr);
            System.out.printf("%.2f%%",winPercent);

    }
}
