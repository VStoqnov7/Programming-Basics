package P14Exercises;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        double totalSum = 0;
        double totalWin = 0;
        double totalLose = 0;

        for (int i = 1; i <= number; i++) {
            String command = scanner.nextLine();

            double sum = 0;
            double win = 0;
            double lose = 0;
            while (!command.equals("Finish")) {

                String sport = scanner.nextLine();

                switch (sport) {
                    case "win":
                        sum += 20;
                        win++;
                        totalWin++;
                        break;
                    case "lose":
                        sum += 0;
                        lose++;
                        totalLose++;
                        break;
                }


                command = scanner.nextLine();
            }

                if (win > lose) {
                    sum = sum + sum * 0.10;
                }
                totalSum += sum;

        }


        if (totalWin > totalLose){

            System.out.printf("You won the tournament! Total raised money: %.2f",totalSum + totalSum * 0.20);


        }else {

            System.out.printf("You lost the tournament! Total raised money: %.2f",totalSum);

        }

    }
}
