package P14Exercises;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        double back = 0;
        double chest = 0;
        double legs = 0;
        double abs = 0;
        double proteinShake = 0;
        double proteinBar = 0;
        double p7 = 0;
        double p8 = 0;

        for (int i = 0; i < number; i++) {
        String people = scanner.nextLine();

            switch (people){
                case "Back":
                    back++;
                    p8++;
                    break;
                case "Chest":
                    chest++;
                    p8++;
                    break;
                case "Legs":
                    legs++;
                    p8++;
                    break;
                case "Abs":
                    abs++;
                    p8++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    p7++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    p7++;
                    break;


            }
        }
        System.out.printf("%.0f - back%n",back);
        System.out.printf("%.0f - chest%n",chest);
        System.out.printf("%.0f - legs%n",legs);
        System.out.printf("%.0f - abs%n",abs);
        System.out.printf("%.0f - protein shake%n",proteinShake);
        System.out.printf("%.0f - protein bar%n",proteinBar);
        System.out.printf("%.2f%% - work out%n",p8 / number * 100);
        System.out.printf("%.2f%% - protein",p7 / number * 100);

    }
}
