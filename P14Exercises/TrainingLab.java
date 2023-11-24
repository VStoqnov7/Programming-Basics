package P14Exercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wide = h * 100 - 100;
        double wide1 =Math.floor( wide / 70);





        double longs = w * 100;
        double longs1 =Math.floor( longs / 120);


        double total = wide1 * longs1 - 3;

        System.out.printf("%.0f",total);

    }
}
