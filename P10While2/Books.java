package P10While2;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameBooks = scanner.nextLine();                                  //

        int numberBooks = 0;                                                 //

        String input = scanner.nextLine();                                   //

        boolean isFound = false;                                             //

        while (!input.equals("No More Books")) {                              //
            if (input.equals(nameBooks)){                                     //
                isFound = true;                                            //
                break;                                                     //
            }

                numberBooks++;                                              //
            input = scanner.nextLine();                                       //
        }



        if (isFound){                                                                      //
            System.out.printf("You checked %d books and found it.",numberBooks);            //
        }else {
            System.out.printf("The book you search is not here!%nYou checked %d books.",numberBooks);                  //
        }


    }
}
