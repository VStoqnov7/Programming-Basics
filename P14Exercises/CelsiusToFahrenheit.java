package P14Exercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = Double.parseDouble(scanner.nextLine());

        double t = c * 9 / 5 + 32;
        System.out.printf("%.2f",t);



    }
}
