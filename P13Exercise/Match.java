package P13Exercise;

import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        for (int i = 1; i <= 2 ; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 2; k++) {
                    for (int l = 1; l <= 2; l++) {
                        for (int m = 1; m <= 2 ; m++) {
                            for (int n = 1; n <= 2 ; n++) {
                                number++;


                                System.out.printf("%d.%d%d%d%d%d%d  ;;;%n",number,i,j,k,l,m,n);



                            }
                        }


                    }

                }

            }

        }





    }
}
