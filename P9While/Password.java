package P9While;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();            /// prochita ime / nakov/
        String password = scanner.nextLine();           /// prochita parola /1234/

        String input = scanner.nextLine();              /// vxoda koito shte vuvede potrebitela v opit da oceli parolata

        while (!input.equals(password)){               /// dokato vxoda e razlichen ot parolata

            input = scanner.nextLine();               /// prochitame oshte edin red ot konzolata

        }
        System.out.printf("Welcome %s!",userName);




    }
}
