package P10While2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoneyFoExcursion = Double.parseDouble(scanner.nextLine());    //Пари, нужни за екскурзията:
        double haveMoney = Double.parseDouble(scanner.nextLine());               //Налични пари

        int daysCounter = 0;                                                    //броя изминали дни
        int spendingCounter = 0;                                                // броя последователни дни

        while (haveMoney < needMoneyFoExcursion && spendingCounter < 5){      // while цикъл, който продължава, докато парите на Джеси са по-малко от парите, които са
                                                                              // нужни за екскурзията и броячът за последователните дни е по-малък от 5


            String command = scanner.nextLine();                            //При всяко повторение на цикъла четете от конзолата два реда - първият ред е текст -  spend или save

            double money = Double.parseDouble(scanner.nextLine());          //  торият – парите, които Джеси е спестила или похарчила

            daysCounter++;                                                  //Също така увеличете брояча за дни с 1

        if ("save".equals(command)){                                           //aко спестява

            haveMoney += money;                                               //прибавете спестените пари към нейните
            spendingCounter = 0;                                              //нулирайте брояча за поредните дни

        } else if ("spend".equals(command)) {                                    //aко харчи

            haveMoney -= money;                                                  //извадете от нейните пари сумата която е похарчила
            spendingCounter +=1;                                                 //увеличете брояча за поредните дни, в които харчи

            if (haveMoney < 0 ){                                                //Проверете дали парите на Джеси са станали по-малко от нула
                haveMoney = 0;                                                    //и ако е така, то тя е останала без пари и има нула лева
            }

        }
        if (spendingCounter ==5){                                                 //След цикъла проверете дали Джеси е харчила пари в пет последователни дни
            System.out.println("You can't save the money.");                    //и принтирайте съобщението
            System.out.println(daysCounter);                                    //и принтирайте съобщението

        }
        if (haveMoney >= needMoneyFoExcursion){                                    //Също така проверете дали Джеси е събрала парите
            System.out.printf("You saved the money for %d days.",daysCounter);          //и, ако е успяла, принтирайте съответното съобщение:

        }
        }
        }
    }
