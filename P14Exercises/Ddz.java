package P14Exercises;

import java.util.Scanner;

public class Ddz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 2; i <= number ; i += 2) {

            System.out.println(Math.pow(2,i));

        }








    }
}
