package Test;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String evaluation = scanner.nextLine();



        int night = day - 1;
        double sum = 0;


        switch (name){

            case "room for one person":
                sum = night * 18;
                break;
            case "apartment":
                sum = night * 25;
                if (night > 0 && night < 10) {
                    sum = sum - sum * 0.30;
                } else if (night >= 10 && night < 15) {
                    sum = sum - sum * 0.35;

                }else{
                    sum = sum - sum * 0.50;
                }


                break;
            case "president apartment":
                sum = night * 35;
                if (night > 0 && night < 10) {
                    sum = sum - sum * 0.10;
                } else if (night >= 10 && night < 15) {
                    sum = sum - sum * 0.15;

                }else{
                    sum = sum - sum * 0.20;
                }
                break;

        }

        if (evaluation.equals("positive")){

            sum = sum + sum * 0.25;

            
        } else if (evaluation.equals("negative")) {
            sum = sum - sum * 0.10;
            
        }


        System.out.printf("%.2f",sum);


    }
}
