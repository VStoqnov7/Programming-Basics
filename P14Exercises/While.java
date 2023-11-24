package P14Exercises;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);

            sum += number;


            input = scanner.nextLine();
        }


        System.out.printf("%s - %.2f",name,sum);






    }
}
