package P14Exercises;

import java.util.Scanner;

public class MovieRatingsMinMaxNumberOrString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberFilm = Integer.parseInt(scanner.nextLine());

        double maxNumber = Double.MIN_VALUE;
        double minNumber = Double.MAX_VALUE;
        double rating1 = 0;

        double p1 = 0;

        double films = 0;

        String nameMax = "";
        String nameMin = "";

        for (int i = 0; i < numberFilm; i++) {
        String nameFilm = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        rating1 += number;
        films++;




            if (number > maxNumber) {

                maxNumber = number;
                nameMax = nameFilm;

            }

            if (number < minNumber) {

                minNumber = number;
                nameMin = nameFilm;

            }


        }
                System.out.printf("%s is with highest rating: %.1f%n",nameMax,maxNumber);
                System.out.printf("%s is with lowest rating: %.1f%n",nameMin,minNumber);

        double ratingFilms = rating1 / films;


        System.out.printf("Average rating: %.1f",ratingFilms);
    }
}
