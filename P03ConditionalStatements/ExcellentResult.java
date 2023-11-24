package P03ConditionalStatements;

import java.util.Scanner;

import static java.lang.System.in;

public class ExcellentResult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) ;{
            System.out.println("Excellent");

        }
    }
}
