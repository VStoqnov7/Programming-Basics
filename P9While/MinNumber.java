package P9While;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;


        while (!name.equals("Stop")){

            int number = Integer.parseInt(name);

            if (number < minNumber){
                minNumber = number;

            }

                name = scanner.nextLine();
        }

        System.out.println(minNumber);

    }
}
