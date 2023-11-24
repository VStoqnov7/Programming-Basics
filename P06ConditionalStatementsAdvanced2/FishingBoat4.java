package P06ConditionalStatementsAdvanced2;

import java.util.Scanner;

public class FishingBoat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double priceForSeason = 0;

        switch (season) {
            case "Spring":
                priceForSeason = 3000;
                if (fishermen > 0 && fishermen <= 6) {
                    priceForSeason = priceForSeason - priceForSeason * 0.10;

                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }

                } else if (fishermen > 7 && fishermen <= 11) {
                    priceForSeason = priceForSeason - priceForSeason * 0.15;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }


                } else if (fishermen > 12) {
                    priceForSeason = priceForSeason - priceForSeason * 0.25;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }
                }
                break;

            case "Summer":
                priceForSeason = 4200;
                if (fishermen > 0 && fishermen <= 6) {
                    priceForSeason = priceForSeason - priceForSeason * 0.10;

                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }

                } else if (fishermen > 7 && fishermen <= 11) {
                    priceForSeason = priceForSeason - priceForSeason * 0.15;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }


                } else if (fishermen > 12) {
                    priceForSeason = priceForSeason - priceForSeason * 0.25;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }
                }
                break;

            case "Autumn":
                priceForSeason = 4200;
                if (fishermen > 0 && fishermen <= 6) {
                    priceForSeason = priceForSeason - priceForSeason * 0.10;

                } else if (fishermen > 7 && fishermen <= 11) {
                    priceForSeason = priceForSeason - priceForSeason * 0.15;


                } else if (fishermen > 12) {
                    priceForSeason = priceForSeason - priceForSeason * 0.25;
                }

                break;


            case "Winter":
                priceForSeason = 2600;
                if (fishermen > 0 && fishermen <= 6) {
                    priceForSeason = priceForSeason - priceForSeason * 0.10;

                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }

                } else if (fishermen > 7 && fishermen <= 11) {
                    priceForSeason = priceForSeason - priceForSeason * 0.15;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;
                    }


                } else if (fishermen > 12) {
                    priceForSeason = priceForSeason - priceForSeason * 0.25;
                    if (fishermen % 2 == 0) {
                        priceForSeason = priceForSeason - priceForSeason * 0.05;


                    }

                }
        }

        double sum = Math.abs(budget - priceForSeason);
        if (budget >= priceForSeason) {
        System.out.printf("Yes! You have %.2f leva left.", sum);
    }else if (budget <= priceForSeason){
        System.out.printf("Not enough money! You need %.2f leva.",sum);

    }
}
}
