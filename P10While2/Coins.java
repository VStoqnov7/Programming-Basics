package P10While2;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());              //  chetem ot konzolata kolko pari trqbva da vurnem kato resto

        double totalCoins = Math.floor(sum * 100);                       // prevrushtame vsicko v stotinki primer  5leva po 100 = 500 stotinki     ili 1.23 = 123 stotinki
                                                                         //


        int countCoins = 0;                                               //kolko stotinki sme vurnali

        while (totalCoins > 0) {                                          // dokato nashte stotinki sa po golqmi ot 0 proverqvame

            if (totalCoins >= 200) {                                    // ako vsichkite stotinki sa po golemi ili ravni na 200
                countCoins++;                                            // uvelichavame stoinosta na stotinkite
                totalCoins -= 200;                                       // vadim ot 200 stotinki ot obshtite stotinki


            } else if (totalCoins >= 100) {                              // ako vsichki stotinki sa po golqmi ili ravni na 100

                countCoins++;                                            // uvelichavame stotinkite s 1
                totalCoins -= 100;                                      // i vadim 100 stotinki ot obshtite stotinki


            } else if (totalCoins >= 50) {                              // ako vsicki stotinki sa po golemi ili ravni na 50
                countCoins++;                                          // uvelichavame s 1 stotinkia
                totalCoins -= 50;                                        // izvajdame 50 stotinki ot obshtite stotinki

            } else if (totalCoins >= 20) {                               //ako vsichki stotinki sa po golemi ili ravni na 20
                countCoins++;                                           //uvelichavame stotinkite s 1
                totalCoins -= 20;                                       // i vadim 20 stotinki ot obshtite stotinki

            } else if (totalCoins >= 10) {                           // ako vsichki stotinki sa po golemi ili ravni na 10
                countCoins++;                                            //uvelichavame stotinkite s 1
                totalCoins -= 10;                                        // i vadim 10 stotinki ot obshtite stotinki


            } else if (totalCoins >= 5) {                                // ako vsichki stotinki sa po golemi ot 5
                countCoins++;                                            // uvelichavame stotinkite s 1
                totalCoins -= 5;                                         // i vadim 5 stotinki ot obshtite stotinki

            } else if (totalCoins >= 2) {                               // ako vsichki stotinnki sa poveche ot 2
                countCoins++;                                          // uvelichavame stotinkite s 1
                totalCoins -= 2;                                        // i vadim 2 stotinki ot obshtite stotinki

            } else if (totalCoins >= 1) {                            // ako stotinkite sa po golemi ili ravni na 1
                countCoins++;                                         //uvelichavame stotinkite s 1
                totalCoins -= 1;                                      //i vadim 1 stotinka ot obshtite stotinki
            }

        }
        System.out.println(countCoins);                              //printirame obshtite stotinki kolko na broi sa
    }
}