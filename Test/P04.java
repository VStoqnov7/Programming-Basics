package Test;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        double day = Double.parseDouble(scanner.nextLine());

        double sum = day;
        double totalSum = day;

        for (int i = 1; i <= n ; i++) {

            int percent = Integer.parseInt(scanner.nextLine());

            double percentPercent = 1.0 * percent / 100;

            sum = sum + sum * percentPercent;

            totalSum += sum;



        }


        double sumSum = Math.abs(totalSum - 1000);

        double x = Math.abs(totalSum - 1000);



        if (totalSum >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(x));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(x));
        }










    }
}
