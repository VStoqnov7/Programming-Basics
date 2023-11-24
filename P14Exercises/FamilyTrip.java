package P14Exercises;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        int moreMoney = Integer.parseInt(scanner.nextLine());


        if (night > 7){
            priceForNight =priceForNight - priceForNight * 0.05;         // 95

        }

        double moneyForNight = night * priceForNight;             ///760


        double morePriceMoney = 0.01 * moreMoney;                // 0.02

        double moreMoneyPrice = budget * morePriceMoney;          // 16.01

        double money = moneyForNight + moreMoneyPrice;       //  776.01

        double totalMoney = Math.abs(budget - money);


        if (money <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",totalMoney);
        }else {
            System.out.printf("%.2f leva needed.",totalMoney);
        }


    }
}
