package P06ConditionalStatementsAdvanced2;

import java.util.Scanner;

public class SkiTrip9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfStay = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();


        double night = dayOfStay - 1;
        double priceForNigh = 0;


        switch (room) {


            case "room for one person":
                priceForNigh = night * 18.00;

                break;
            case "apartment":
                priceForNigh = night * 25.00;

                if (dayOfStay > 0 && dayOfStay < 10) {
                    priceForNigh = priceForNigh - priceForNigh * 0.30;


                } else if (dayOfStay > 10 && dayOfStay < 15) {
                    priceForNigh = priceForNigh - priceForNigh * 0.35;


                } else if (dayOfStay > 15) {
                    priceForNigh = priceForNigh - priceForNigh * 0.50;



                }

                break;
            case "president apartment":
                priceForNigh = night * 35.00;

                if (dayOfStay > 0 && dayOfStay < 10) {
                    priceForNigh = priceForNigh - priceForNigh * 0.10;


                } else if (dayOfStay > 10 && dayOfStay < 15) {
                    priceForNigh = priceForNigh - priceForNigh * 0.15;


                } else if (dayOfStay > 15) {
                    priceForNigh = priceForNigh - priceForNigh * 0.20;


                }
                break;

        }

                if (evaluation.equals("positive")) {

                    priceForNigh = priceForNigh + (priceForNigh * 0.25);

                } else if (evaluation.equals("negative")){

                priceForNigh = priceForNigh - (priceForNigh * 0.10);

                }

        System.out.printf("%.2f",priceForNigh);

        }
        }

