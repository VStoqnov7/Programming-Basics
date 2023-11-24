package P14Exercises;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());
        int numberKidTickets = Integer.parseInt(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());
        double sumSum = Double.parseDouble(scanner.nextLine());




        double priceKid = sum - sum * 0.70;           //36
        double pricePeople = sum + sumSum;        //160
        double priceKidSum = priceKid + sumSum;        //76
        double totalSum = (numberKidTickets * priceKidSum) + (numberTickets * pricePeople);        //2780
        double win = totalSum * 0.20;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,win);







    }
}
