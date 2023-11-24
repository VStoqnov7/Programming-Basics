package Test;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int firstNumber1 = number / 100 % 10;
        int secondNumber1 = number / 10 % 10;
        int thirdNumber1 = number % 10;


        for (int i = 1; i <= thirdNumber1; i++) {
            for (int j = 1; j <= secondNumber1; j++) {
                for (int k = 1; k <= firstNumber1; k++) {

                    int result = i * j * k;

                    System.out.printf("%d * %d * %d = %d;%n", i, j, k,result);


                }

            }

        }


    }
}
