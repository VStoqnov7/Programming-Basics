package P09While;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();       /// chete tekst ot konzolata

        while (!name.equals("Stop")){           ///// prochitame ot konzolata dokato ne doide Stop


            System.out.println(name);          /// printirame dokato ne doide Stop

            name = scanner.nextLine();         ///// proverqvame sledvashtoto ime osven ako nqma stop veche

        }

    }
}
