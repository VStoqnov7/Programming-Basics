package P13Exercise;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        int firstNumber = start / 1000 % 10;
        int secondNumber = start / 100 % 10;
        int thirdNumber = start / 10 % 10;
        int forthNumber = start % 10;

        int firstNumber1 = end / 1000 % 10;
        int secondNumber1 = end / 100 % 10;
        int thirdNumber1 = end / 10 % 10;
        int forthNumber1 = end % 10;



        for (int i = firstNumber; i <= firstNumber1 ; i++) {
            for (int j = secondNumber; j <= secondNumber1; j++) {
                for (int k = thirdNumber; k <= thirdNumber1; k++) {
                    for (int l = forthNumber; l <= forthNumber1; l++) {

                        if (i % 2 == 1 && j % 2 == 1 && k % 2 == 1 && l % 2 == 1){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }

                }

            }

        }










    }
}
