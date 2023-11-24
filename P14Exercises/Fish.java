package P14Exercises;

import java.util.Scanner;

public class Fish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerel = Double.parseDouble(scanner.nextLine()); /// skumriq
        double sprinkle = Double.parseDouble(scanner.nextLine()); /// caca
        double bonito = Double.parseDouble(scanner.nextLine()); /// palamud
        double scad = Double.parseDouble(scanner.nextLine()); ///safrid
        int mussel = Integer.parseInt(scanner.nextLine());  /// midi


        double sumBonito = mackerel + mackerel * 0.60;
        double finalBonito = sumBonito * bonito;                 // palamud


        double sumScad = sprinkle + sprinkle * 0.80;
        double finalScad = sumScad * scad;                 //safrid



        double finalMussel = 7.50 * mussel;          //// midi

        double totalSum = finalBonito + finalScad + finalMussel;

        System.out.printf("%.2f",totalSum);
    }
}
