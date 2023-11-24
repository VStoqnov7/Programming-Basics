package P10While2;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int with = Integer.parseInt(scanner.nextLine());                       // chetem razmerite na tortata = shirochina
        int length = Integer.parseInt(scanner.nextLine());                     //chetem razmerite na tortata = duljina

        String command = scanner.nextLine();                                   // prochitane na komandata STOP

        int countPieces = with * length;                                       // presmqtame shirochinata po duljinata i razbirame kolko parcheta razpolagame primerno 10*10 = 100 parcheta

        while (!command.equals("STOP")){                                         // dokato komandata ni e razlichna ot STOP

            int currentPieces = Integer.parseInt(command);                      // segashnite parcheta gi pravim ot String na int

            countPieces -= currentPieces;                                       // ot vsichki parcheta izvajdame parchetata koito daden gost si e vzel

            if (countPieces <= 0){                                               // dali parchetata vsluchai che sa po malki ili ravni na 0


                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(countPieces));              //printirame kogato parchetata sa po malko ot 0 i
                                                                                                                     // printirame s Math.Abs kolko parcheta sa po malko ot 0

                break;                                                          // ako parchtata sa po malko ili ravni na 0 prekratqvame cikula
            }

            command = scanner.nextLine();                                           // prochitane na nova komanda
        }

        if (countPieces >= 0 ){                                                       // ako parchetata sa ni po golemi ili ravni na 0
            System.out.printf("%d pieces are left.",countPieces);                      //printirame kolko parcheta sa ni ostanali
        }
    }
}
