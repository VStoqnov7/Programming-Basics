package P10While2;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());                                 // prochitame shirinata
        int length = Integer.parseInt(scanner.nextLine());                                //prochitame duljina
        int height = Integer.parseInt(scanner.nextLine());                                //prochitame visochina

        int availableSpace = width * length * height;                                     //svobodno mqsto koeto imame i smqtame kolko kubichni metri imame nalichni  shirina * duljina * visochina primerno 10 * 10 * 10 = 1000 kubichni metra

        String command = scanner.nextLine();                                              // promenliva String koqto poluchavame ot konzolata

        while (!command.equals("Done")){                                                  // dokato komandata e razlichna ot Done

            int currentCountBoxes = Integer.parseInt(command);                            //do v momenta komandata ni e string i sega q obrazuvame na int

            availableSpace -= currentCountBoxes;                                         // izvajdame segashnite kashoni

            if (availableSpace <= 0 ){                                                   // ako svobodnoto mqsto svurshi  ako svobodnoto ni prostranstvo e po malko ili ravno na 0

                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(availableSpace));             // izpisvame kubichni metri koito ne ni dostigat

                break;                                                                    // akosvobodnoto mqsto svurshi prekusni cikula
            }

            command = scanner.nextLine();                                                // poluchavame sledvashta komanda dokato ne stane Done
        }

        if (availableSpace > 0 /*command.equals("Done")*/){                                                          // ako svobodnoto ni prostranstvo stigne ili stignem komanda Done

            System.out.printf("%d Cubic meters left.",availableSpace);                      //printirame svobodnoto prostranstvo sled kato e dostignal komanda Done
        }


    }
}
