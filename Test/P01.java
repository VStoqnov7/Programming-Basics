package Test;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberPaper = Integer.parseInt(scanner.nextLine());
        int numberCloth = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int reduction = Integer.parseInt(scanner.nextLine());



        double pricePaper = numberPaper * 5.80;       //11.60
        double priceCloth = numberCloth * 7.20;          //21.60
        double priceGlue = glue * 1.20;                //3.00
        double sum = pricePaper + priceCloth + priceGlue;          //36.20
        double percent = 1.0 * reduction / 100;
        double totalSum = sum - sum * percent;


        System.out.printf("%.3f",totalSum);
















    }
}
