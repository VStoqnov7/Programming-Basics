package P13Exercise;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int meeting = Integer.parseInt(scanner.nextLine());

        double win = 0;
        double numberWin = 0;

        double noWin = 0;
        double numberNoWin = 0;

        double numberLose = 0;
        double numberPlay = 0;


        for (int i = 0; i < meeting; i++) {

            String letter = scanner.nextLine();

            switch (letter){

                case "W":
                    win += 3;
                    numberWin++;
                    numberPlay++;
                    break;
                case "D":
                    noWin += 1;
                    numberNoWin++;
                    numberPlay++;

                    break;
                case "L":
                    numberLose++;
                    numberPlay++;

                    break;

            }

        }




        double totalPoints = win + noWin;
        double percent = numberWin / numberPlay * 100;


        if (meeting > 0){

        System.out.printf("%s has won %.0f points during this season.%n",name,totalPoints);
        System.out.printf("Total stats:%n");
        System.out.printf("## W: %.0f%n",numberWin);
        System.out.printf("## D: %.0f%n",numberNoWin);
        System.out.printf("## L: %.0f%n",numberLose);
        System.out.printf("Win rate: %.2f%%",percent);
    }else {
            System.out.printf("%s hasn't played any games during this season.",name);


        }
}
}