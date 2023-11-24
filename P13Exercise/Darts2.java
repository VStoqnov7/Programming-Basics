package P13Exercise;

import java.util.Scanner;

public class Darts2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String command = scanner.nextLine();


        double pointGame = 301;
        double shots = 0;
        double shotStop = 0;

        while (!command.equals("Retire")){

            int points = Integer.parseInt(scanner.nextLine());

            switch (command){
                case "Single":
                    if (pointGame >= points){
                        shots++;
                    pointGame -= points;
                    }else {
                        shotStop++;
                    }
                    break;
                case "Double":
                    points = points * 2;
                    if (pointGame >= points){
                        shots++;
                        pointGame -= points;
                    }else {
                        shotStop++;
                    }
                    break;
                case "Triple":
                    points = points * 3;
                    if (pointGame >= points){
                        shots++;
                        pointGame -= points;
                    }else {
                        shotStop++;

                    }
                    break;
            }

            if (pointGame == 0){
                break;
            }

            command = scanner.nextLine();
        }



        if ( pointGame == 0){
            System.out.printf("%s won the leg with %.0f shots.",name,shots);
        }else {
            System.out.printf("%s retired after %.0f unsuccessful shots.",name,shotStop);
        }

    }
}
