package P10While2;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();                                                 // chetem komanda koqto chete broi stupki ot konzolata
        int sumSteps = 0;                                                                    // sumata koqto v nachaloto e ravna na 0

        while (!command.equals("Going home")){                                              // dokato komandata ne ni e ravna na Goin home ili komandata ni e ralichna

            int currentSteps = Integer.parseInt(command);                                   // stupkite koito v momenta trqbva da prochetem ot konzolata i gi parsvame kum int
            sumSteps += currentSteps;                                                       // subirame kum komandata ni stupkite


            if (sumSteps >= 10000){                                                          // proverqvame dali sumata ot stupkite e po golqma ili ravna na 10 000
                break;                                                                     // tuka prekratqvame cikula kogato stupkite sa po golqmi ot 10 000
            }



            command = scanner.nextLine();                                                   // komandata koqto shte prochete sledvashtiqt red
                                                                                            // i garantirame nakraq neshto razlichno za komandata
        }

        if (command.equals("Going home")){                                               //  ako komandata ni e ravna na Going home

            int stepsToHome = Integer.parseInt(scanner.nextLine());                        // stupkite koito tq shte izvurvi do vkushti
            sumSteps += stepsToHome;                                                       // vsichkite stupki gi probavqme kum tazi suma

        }

        if (sumSteps >= 10000){                                                              // proverka koqto e izvun nashiqt cikul v koqto proverqvame  sumSteps dali e po golqma ili
                                                                                             // ravna na 10 000

                System.out.println("Goal reached! Good job!");                              // printirame che celta e izpulnena
                System.out.printf("%d steps over the goal!",sumSteps - 10000);              // printirame kolko e razlikata mejdu stupkite




        }else {
            System.out.printf("%d more steps to reach goal.",10000 - sumSteps);              // printirame razlikata na kolko stupki ne sa i dostignali  / 10 00 minus vsichki stupki koito
                                                                                            // tq e izvurvqla

        }


    }
}
