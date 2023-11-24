package P14Exercises;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        boolean isValid = false;


        while (!input.equals("End")) {

            switch (input){
                case "one":
                    number2 -= 1;
                    break;
                case "two":
                    number1 -= 1;
                    break;
            }

            if (number1 == 0 || number2 == 0){
                isValid = true;
                break;
            }

            if (isValid){
                break;
            }



            input = scanner.nextLine();
        }

        if (number1 == 0){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",number2);
        } else if (number2 == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",number1);

        }

        if (input.equals("End")){
            System.out.printf("Player one has %d eggs left.%n",number1);
            System.out.printf("Player two has %d eggs left.",number2);



        }



        }


    }
