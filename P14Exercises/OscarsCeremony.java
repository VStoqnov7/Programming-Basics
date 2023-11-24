package P14Exercises;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = Integer.parseInt(scanner.nextLine());


        double rent = sum - sum * 0.30;                //  2450
        double catering = rent - rent * 0.15;          //  2082.5
        double sound = catering - catering / 2;        //1041.25

        double totalSum = sum + rent + catering + sound;

        System.out.printf("%.2f",totalSum);

    }
}
