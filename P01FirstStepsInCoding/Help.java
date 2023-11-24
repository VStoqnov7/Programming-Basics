package P01FirstStepsInCoding;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.next();

        System.out.printf("You are %s %s, a %d-years old from %s.",firstName,lastName,age,town);
    }
}
