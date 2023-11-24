package P14Exercises;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberEgg = Integer.parseInt(scanner.nextLine());


        double redEggs = 0;
        double orangeEggs = 0;
        double blueEggs = 0;
        double greenEggs = 0;


        double maxEgg = Double.MIN_VALUE;
        String name = "";

        for (int i = 1; i <= numberEgg ; i++) {

        String egg = scanner.nextLine();


        switch (egg){
            case "red":
                redEggs++;
                if (maxEgg < redEggs){
                    maxEgg++;
                    name = egg;
                }
                break;
            case "orange":
                orangeEggs++;
                if (maxEgg < orangeEggs){
                    maxEgg++;
                    name = egg;
                }
                break;
            case "blue":
                blueEggs++;
                if (maxEgg < blueEggs){
                    maxEgg++;
                    name = egg;
                }
                break;
            case "green":
                greenEggs++;
                if (maxEgg < greenEggs){
                    maxEgg++;
                    name = egg;
                }
                break;
        }
        }
        System.out.printf("Red eggs: %.0f%n",redEggs);
        System.out.printf("Orange eggs: %.0f%n",orangeEggs);
        System.out.printf("Blue eggs: %.0f%n",blueEggs);
        System.out.printf("Green eggs: %.0f%n",greenEggs);
        System.out.printf("Max eggs: %.0f -> %s",maxEgg,name);
    }
}
