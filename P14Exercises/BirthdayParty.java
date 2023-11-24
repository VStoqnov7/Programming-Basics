package P14Exercises;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rent = Double.parseDouble(scanner.nextLine());


        double cake = rent * 0.20;
        double drinks = cake - cake * 0.45;
        double anime = rent / 3;


        double sum = rent + cake + drinks + anime;


        System.out.printf("%.1f",sum);











    }
}
