package P12NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (!name.equals("stop")){

            int number = Integer.parseInt(name);

            if (number < 0){
                System.out.println("Number is negative.");
                name = scanner.nextLine();
                continue;
            }
            int count = 1;
            for (int i = 2; i <= number ; i++) {
                if (number % i == 0){
                    count++;

                }
                if (count == 3){
                    break;
                }

            }
            if (count > 2){
                sumNonPrimeNumbers += number;
            }else {
                sumPrimeNumbers += number;
            }

            name = scanner.nextLine();

        }


        System.out.printf("Sum of all prime numbers is: %d%n",sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrimeNumbers);


    }
}
