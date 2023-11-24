package P14Exercises;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double flour = Double.parseDouble(scanner.nextLine());            // brashno
        double kiloFlour = Double.parseDouble(scanner.nextLine());          // kilogram brashno
        double kiloSugar = Double.parseDouble(scanner.nextLine());          // kilogram zaxar
        int eggs = Integer.parseInt(scanner.nextLine());                  /// kori qica
        int maq = Integer.parseInt(scanner.nextLine());                   // maq paketi





        double kiloSugar1 = flour - flour * 0.25;          //37.5
        double eggs1 = flour + flour * 0.10;          //55
        double maq1 = kiloSugar1 - kiloSugar1 * 0.80;        //7.5


        double sumFlour = flour * kiloFlour;        ///500
        double sumSugar = kiloSugar1 * kiloSugar ;   // 131.25
        double sumEgg = eggs1 * eggs;                 //330
        double sumMaq = maq1 * maq;               //7.5


        double totalSum = sumFlour + sumSugar + sumEgg + sumMaq;


        System.out.printf("%.2f",totalSum);








    }
}
