package P01FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());

        double sumForDog = dog * 2.50;
        double sumForCat = cat * 4;

        double totalSum = sumForDog + sumForCat;

        System.out.printf (" %f lv.",totalSum);
    }
}
