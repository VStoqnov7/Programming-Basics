package P03ConditionalStatements;

import java.util.Scanner;

import static java.lang.System.in;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int  number = Integer.parseInt(scanner.nextLine());
        boolean isEven = number % 2 == 0;
        if (isEven){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
