package P14Exercises;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberPeople = Integer.parseInt(scanner.nextLine());
        double priceWelcome = Double.parseDouble(scanner.nextLine());
        double priceForOneSunLonger = Double.parseDouble(scanner.nextLine());
        double priceForOneUmbrella = Double.parseDouble(scanner.nextLine());


        double welcome = numberPeople * priceWelcome;         //115.50

        double sunLonger = Math.ceil( numberPeople * 0.75);              /// 16


        double needSunLonger = sunLonger * priceForOneSunLonger;        //70.40

        double umbrella = Math.ceil(numberPeople * 0.50) ;                  //11

        double needUmbrella = umbrella * priceForOneUmbrella;             // 68.20

        double totalSum = welcome + needSunLonger + needUmbrella;

        System.out.printf("%.2f lv.",totalSum);




    }
}
