package P11NestedLoopsLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int y = 1; y <= 10 ; y++) {

            for (int x = 1; x <= 10 ; x++) {
                int product = x * y;


                System.out.printf("%d * %d = %d%n",y,x,product );
            }

        }

    }
}
