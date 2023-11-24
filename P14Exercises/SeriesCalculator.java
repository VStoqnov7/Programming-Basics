package P14Exercises;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int numberSeason = Integer.parseInt(scanner.nextLine());
        int numberEpisode = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());




        double time1 = time * 0.20;
        double episodeTime = time1 + time;
        double u = numberSeason * 10;
        double total = episodeTime * numberEpisode * numberSeason + u;


        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name,Math.floor(total));










    }
}
