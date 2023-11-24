package P14Exercises;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirst = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        double buyEgg = 0;
        boolean isValid = false;

        while (!input.equals("Close")) {

            int number = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case "Buy":
                    if (eggsFirst < number) {
                        isValid = true;
                        break;
                    }
                    eggsFirst -= number;
                    buyEgg += number;

                    break;
                case "Fill":
                    eggsFirst += number;

                    break;
            }

            if (isValid){
                break;
            }
            input = scanner.nextLine();

        }
        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%.0f eggs sold.", buyEgg);

        }
        if (isValid) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsFirst);
        }
    }
}
