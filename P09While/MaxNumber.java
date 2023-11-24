package P09While;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();                    /// chetem stringove vsichki chisla

        int maxNumber = Integer.MIN_VALUE;                    /// maxNumber purvonachalno e raven na nai malkoto chislo na int


        while (!input.equals("Stop")){                          // dokato input e razlichen ot komandata Stop

            int number = Integer.parseInt(input);              /// obrazuvame input v int chislo zashtoto do sega gi chetem kato stringove

            if (number > maxNumber){                         /// ako number e po golqmo ot maxNumber

                maxNumber = number;                          /// to togava maxNumber priemi stoinosta na number
            }


            input = scanner.nextLine();                        // prochita po edin red ot konzolata
        }
        System.out.println(maxNumber);                    // printirame maxNumber stoinostta



    }
}
