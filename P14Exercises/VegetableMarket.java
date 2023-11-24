package P14Exercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfVegetables = Double.parseDouble(scanner.nextLine());
        double priceOfFruit = Double.parseDouble(scanner.nextLine());
        int kilogramOfVegetables = Integer.parseInt(scanner.nextLine());
        int kilogramOfFruit = Integer.parseInt(scanner.nextLine());


        double fruit = 1.0 * kilogramOfFruit * priceOfFruit;
        double vegetables = 1.0 * kilogramOfVegetables * priceOfVegetables ;

        double sum = fruit + vegetables;
        double sum1 = sum / 1.94 ;

        System.out.printf("%.2f",sum1);




    }
}
