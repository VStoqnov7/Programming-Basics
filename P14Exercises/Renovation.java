package P14Exercises;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());               /// visochina
        int width = Integer.parseInt(scanner.nextLine());               /// shirina
        int percent = Integer.parseInt(scanner.nextLine());               /// procenti

        String name = scanner.nextLine();


        double totalArea = height * width * 4;                 // 24     obshta povurxnina

        double areaPercent = totalArea - totalArea * percent / 100;                //18  steni za boqdisvane


        while (!name.equals("Tired!")) {
            int paint = Integer.parseInt(name);                  /// litri boq

            areaPercent -= paint;

            if (areaPercent <= 0) {
                break;
            }

            name = scanner.nextLine();
        }

        if (areaPercent == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");


        } else if (name.equals("Tired!")) {

        System.out.printf("%.0f quadratic m left.", areaPercent);                                    /// povurxninata


        }else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaPercent));

        }

    }


}

