package P10While2;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialFalse = Integer.parseInt(scanner.nextLine());                  ///purvonachalno shte poluchavame broq na zadachite v koito toi moje da zburka

        int countFailedProblems = 0;                                             /// boim kolko nezadovolitelni otcenki ima

        double sumScore = 0;                                                      /// izchislqvame sumata na vsichki otcenki

        int countProblems = 0;                                                    //kolko zadachi e reshil

        String lastProblemName = "";                                              // stringa e raven na 0 i taka zapazvame imeto na poslednata zadacha

        while (countFailedProblems < initialFalse){                                // ako broikata na nezadovolitelnite otcenki e po malka ot purvonachalno zadadenite
            String currentProblemName = scanner.nextLine();                        // chetem string koito e segashnata zadacha

            if (currentProblemName.equals("Enough")){                              /// dali komandata ni e Enough

                break;                                                            ///  ako e Enoug prikluchvame cikula
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());               // tekushtata otcenka koqto nie shte prochitame

            if (currentGrade <= 4){                                                // ako otcenkata e po malka ot 4 e nezadovolitelna
                countFailedProblems++;                                           // uvelichavame nezadovolitelnata otcenka s 1

            }
            sumScore += currentGrade;                                              // subirame sumata na otcenkite
            countProblems++;                                                       //uvelichavame broq na zadachite s 1
            lastProblemName = currentProblemName;                                  // imeto na zadachata da e ravno na imeto na poslednata zadacha v koqto toi e reshil


        }

        if (countFailedProblems >= initialFalse){                                     // ako zadachite na koito e izkaral po niscka otcenka ot 4 e po golqma ili ravna
                                                                                       // ot purvonachalno zadadenite ot uchitelq otcenka

            System.out.printf("You need a break, %d poor grades.",countFailedProblems);          // printirame che na nego mu trqbva pochivka


        }else {                                                                             // v protiven sluchai che po gornoto ne e vqrno

            System.out.printf("Average score: %.2f%n",sumScore/countProblems);              //printirame slednata otcenka koqto razdelqme sumata ot vsichki
                                                                                            // otcenki na broq zadachi koito e reshil

            System.out.printf("Number of problems: %d%n",countProblems);                    //printirame zadachite koito toi e reshil obsht broi

            System.out.printf("Last problem: %s",lastProblemName);                           //printirame  poslednata zadacha v koqto toi e reshil
        }



    }
}
