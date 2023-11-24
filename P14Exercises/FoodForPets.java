package P14Exercises;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double totalEat = 0;
        double percentDog = 0;
        double percentCat = 0;
        double biscuit = 0;
        double eatForDay = 0;


        for (int i = 1; i <= day ; i++) {

            int eatDog = Integer.parseInt(scanner.nextLine());
            int eatCat = Integer.parseInt(scanner.nextLine());


            percentDog += eatDog;
            percentCat += eatCat;

            totalEat += eatDog + eatCat;

            if (i % 3 == 0){
                eatForDay += (eatDog + eatCat) * 0.10;

            }


        }


        System.out.printf("Total eaten biscuits: %.0fgr.%n",eatForDay);
        System.out.printf("%.2f%% of the food has been eaten.%n",totalEat * 100 / food);
        System.out.printf("%.2f%% eaten from the dog.%n",percentDog * 100 / totalEat);
        System.out.printf("%.2f%% eaten from the cat.",percentCat * 100 / totalEat);






    }
}
