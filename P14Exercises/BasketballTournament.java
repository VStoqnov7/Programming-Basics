package P14Exercises;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner .nextLine();

        double win = 0;
        double louse = 0;
        double numberMatches = 0;

        while (!name.equals("End of tournaments")){
        int n = Integer.parseInt(scanner.nextLine());
                numberMatches += n;

            for (int i = 1; i <= n; i++) {
            int pointsWin = Integer.parseInt(scanner.nextLine());
            int pointLouse = Integer.parseInt(scanner.nextLine());

            if (pointsWin > pointLouse){
                win++;
                System.out.printf("Game %d of tournament %s: win with %d points.%n",i,name,Math.abs(pointsWin - pointLouse));

            } else if (pointsWin < pointLouse) {
                louse++;
                System.out.printf("Game %d of tournament %s: lost with %d points.%n",i,name,Math.abs(pointLouse - pointsWin));
            }
            }
            name = scanner .nextLine();
        }

        if (name.equals("End of tournaments")){

            System.out.printf("%.2f%% matches win%n",win / numberMatches * 100);
            System.out.printf("%.2f%% matches lost",louse / numberMatches * 100);


            }
        }
    }
