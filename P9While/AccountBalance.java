package P9While;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();                         ///chetem purvi red ot konzolata

        double sum = 0;                                            //// dobavqme promenliva double suma

        while (!input.equals("NoMoreMoney")){                       ///dokato purviqt red koito chetem ot konzolata e razlichen ot NoMoreMoney

            double currentMoney = Double.parseDouble(input);        /// slagame double zashtoto go chete input kato string i s tazi komanda go obrazuvame na double chislo

            if (currentMoney < 0){                                    // ako currentMoney e po malko ot 0
                System.out.println("Invalid operation!");             // izpechatai Invalid operation!
                break;                                                 /// prekusni cikula
            }

            sum += currentMoney;                                    /// subirame sumata s double chisloto koeto suzdadoxme
            System.out.printf("Increase: %.2f%n",currentMoney);


            input = scanner.nextLine();                             /// prochitai po edin red ot konzolata

        }

        System.out.printf("Total: %.2f",sum);                      /// printirame sumata

    }
}
