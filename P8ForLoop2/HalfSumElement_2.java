package P8ForLoop2;

import java.util.Scanner;

public class HalfSumElement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;




        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > max){
                max = number;

            }

        }
        int sumWhitOutMaxNumber = sum - max;
        if ( max == sumWhitOutMaxNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            int diff = Math.abs(max-sumWhitOutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
