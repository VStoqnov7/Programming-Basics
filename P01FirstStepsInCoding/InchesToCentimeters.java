package P01FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входа
        double inches = Double.parseDouble(scanner.nextLine());
        // Пресмятане
        // 1 inch = 2.54 santimetra
        double centimeters = inches * 2.54;
        //Принтиране на резултата
       System.out.println(centimeters);


    }
}
