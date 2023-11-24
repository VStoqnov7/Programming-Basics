package P14Exercises;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = Double.parseDouble(scanner.nextLine());
        String sim = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();


        double totalSum = 0;
        switch (sim) {
            case "m":

                switch (text){
                    case "Gym":
                        totalSum = 42;
                        break;
                    case "Boxing":
                        totalSum = 41;
                        break;
                    case "Yoga":
                        totalSum = 45;
                        break;
                    case "Zumba":
                        totalSum = 34;
                        break;
                    case "Dances":
                        totalSum = 51;
                        break;
                    case "Pilates":
                        totalSum = 39;
                        break;
                }

                if (age <= 19){
                    totalSum = totalSum - totalSum * 0.20;
                }



                break;
            case "f":
                switch (text){
                    case "Gym":
                        totalSum = 35;
                        break;
                    case "Boxing":
                        totalSum = 37;
                        break;
                    case "Yoga":
                        totalSum = 42;
                        break;
                    case "Zumba":
                        totalSum = 31;
                        break;
                    case "Dances":
                        totalSum = 53;
                        break;
                    case "Pilates":
                        totalSum += 37;
                        break;
                }
                if (age <= 19){
                    totalSum = totalSum - totalSum * 0.20;
                }


                break;


        }


        if (sum > totalSum){

            System.out.printf("You purchased a 1 month pass for %s.",text);



        }else {

            System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(sum - totalSum));

        }




    }
}
