package P01FirstStepsInCoding;

import java.util.Scanner;

public class GreeningYards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        //Изчисления
        double priceNoDiscount = 7.61 * area;
        double discount = priceNoDiscount * 0.18;
        double finalPrice = priceNoDiscount - discount;
        //Принтиране на резултата
        System.out.printf("The final price is : %f lv.%n",finalPrice);
        System.out.printf("The discount is : %f lv.",discount);

    }
}
