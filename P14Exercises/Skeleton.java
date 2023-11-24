package P14Exercises;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minutes = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        double drag = Double.parseDouble(scanner.nextLine());
        int secondDrag = Integer.parseInt(scanner.nextLine());


        double control = minutes * 60 + second;              /// 132
        double number = drag / 120;                           /// 10
        double minus = number * 2.5;                       ///25
        double sum = (drag / 100) * secondDrag - minus;        //95


        if (control >= sum){

            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",sum);



        }else {

            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(control - sum));


        }

    }
}
