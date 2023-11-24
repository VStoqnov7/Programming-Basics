package P14Exercises;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFilm = scanner.nextLine();
        String typeOfHall = scanner.nextLine();
        int ticketNumber = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double income = 0;


        switch (nameFilm){
            case "A Star Is Born":
                switch (typeOfHall){
                    case "normal":
                        sum = 7.50;
                        income = ticketNumber * sum;
                        break;
                    case  "luxury":
                        sum = 10.50;
                        income = ticketNumber * sum;
                        break;
                    case "ultra luxury":
                        sum = 13.50;
                        income = ticketNumber * sum;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (typeOfHall){
                    case "normal":
                        sum = 7.35;
                        income = ticketNumber * sum;
                        break;
                    case  "luxury":
                        sum = 9.45;
                        income = ticketNumber * sum;
                        break;
                    case "ultra luxury":
                        sum = 12.75;
                        income = ticketNumber * sum;
                        break;
                }
                break;
            case "Green Book":
                switch (typeOfHall){
                    case "normal":
                        sum = 8.15;
                        income = ticketNumber * sum;
                        break;
                    case  "luxury":
                        sum = 10.25;
                        income = ticketNumber * sum;
                        break;
                    case "ultra luxury":
                        sum = 13.25;
                        income = ticketNumber * sum;
                        break;
                }
                break;
            case  "The Favourite":
                switch (typeOfHall){
                    case "normal":
                        sum = 8.75;
                        income = ticketNumber * sum;
                        break;
                    case  "luxury":
                        sum = 11.55;
                        income = ticketNumber * sum;
                        break;
                    case "ultra luxury":
                        sum = 13.95;
                        income = ticketNumber * sum;
                        break;
                }
                break;
        }


        System.out.printf("%s -> %.2f lv.",nameFilm,income);
    }
}
