package P13Exercise;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());   // visochina
        double y = Double.parseDouble(scanner.nextLine());  //// duljina
        double h = Double.parseDouble(scanner.nextLine());  //// visochina

        double wall = x * y;  /// stena
        double window = 1.5 * 1.5;    // prozorec
        double sum = 2 * wall - 2 * window;  //// dvete strani obshto
        double back = x * x ;  // zadna stena
        double welcome = 1.2 * 2;  // vratata
        double backEndWelcome = back * 2 - welcome;   /// 2 steni bez vratata
        double total = sum + backEndWelcome; // kvadratni metra
        double paint = total / 3.4; /// boq






        double pr = 2 * (x * y);
        double tr = 2 * (x * h / 2) ;
        double totals = pr + tr;
        double red  = totals / 4.3 ;


        System.out.printf("%.2f%n",paint);
        System.out.printf("%.2f",red);
    }
}
