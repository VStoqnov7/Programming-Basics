package P14Exercises;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodFood = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int food = foodFood * 1000;

        int eatFood = 0;

        while (!command.equals("Adopted")){
            int gramFood = Integer.parseInt(command);

            eatFood += gramFood;

            command = scanner.nextLine();
        }

        if (eatFood <= food){
            System.out.printf("Food is enough! Leftovers: %d grams.",food - eatFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(food - eatFood));
        }

    }
}
