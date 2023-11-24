package P14Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int price = Integer.parseInt(scanner.nextLine());

        double bass = price - price * 0.40;       //192
        double ek = bass - bass * 0.20;        // 153.6
        double ball = ek / 4;                  //38.4
        double acs  = ball / 5;               // 7.68

        double totalSum = price + bass + ek + ball + acs ;


        System.out.printf("%.2f",totalSum);










    }
}
