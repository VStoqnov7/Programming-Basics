package Test;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = 8848;
        double day = 0;
        double rest = 1;
        double noRest = 0;
        double dayOne = 5364;
        boolean isIvan = false;

        for (int i = 1; i <= 5; ) {
            day++;

            String command = scanner.nextLine();


            while (!command.equals("END")) {

                int number = Integer.parseInt(scanner.nextLine());


                if (command.equals("No")) {
                    i--;

                }else if (command.equals("Yes")){
                    rest++;
                    i++;
                }


                dayOne += number;

                if (dayOne >= sum) {
                    isIvan = true;
                    break;
                }
                if (i == 5){
                    isIvan = true;
                    break;
                }

                command = scanner.nextLine();

            }


            if (command.equals("END")) {
                break;
            }
            if (isIvan){
                break;
            }



        }
        if (sum <= dayOne) {
            System.out.printf("Goal reached for %.0f days!", rest);

        } else {

            System.out.println("Failed!");
            System.out.printf("%.0f", dayOne);
        }


    }
}