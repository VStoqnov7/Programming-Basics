package P9While;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());             /// prochitame edno chislo ot konzolata koeto trqbva da dostignem ot subirane

        int sum = 0;                                             ///  suma koqto purvonachalno  0

        while (sum < n){                                         // dokato sumata e po malka ot chisloto
            sum += Integer.parseInt(scanner.nextLine());        /// porochitash vsqko edno chislo ot konzolata sled chisloto N po gore i dobavash kum sumata


        }

        System.out.println(sum);                               //printirame sumata
    }
}
