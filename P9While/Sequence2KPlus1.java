package P9While;

import java.util.Scanner;

public class Sequence2KPlus1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());              //// prochita purvoto chislo ot konzolata

        int k = 1;                                                 ///   chisloto koeto trqbva da spre n kogato stane chisloto tolkova kolkoto e vuvel potrebitela

        while (k <= n){                                           // dokato k e po malko ili ravno na n da vurti cikula

            System.out.println(k);                              // printirame predi updeita

            k = 2 * k + 1;                                      // updeita - k stava chisloto umnojeno po 2 plus 1

        }
    }
}
