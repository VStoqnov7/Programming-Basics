package P9While;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String student = scanner.nextLine();                 /// imeto na uchenika

        int goodGradesCounts = 1 ;                                  /// nqma zavurshen purvi clas

        int poorGradesCount = 0;                                     /// loshite otcenki  zapochvat ot 0

        double allGradesSum = 0;

        boolean isExcluded = false;                                  // izkluchen li e false ne ne e izkluchen

        while (goodGradesCounts <= 12){                               /// dokato dobrite otcenki  sa po malki ili ravni na 12

            if (poorGradesCount == 2) {                           /// ako loshite otcenki  stanat ravni na 2
                isExcluded = true;                                 /// tyk veche isExcluded e vqrno
                break;                                           ///i trqbva da budem izklucheni

            }
            double currentGrade = Double.parseDouble(scanner.nextLine());    /// prochitai mi po 1 otcenka ot konzolata

            if (currentGrade < 4){                             /// ako tekushtata otcenka e po malka ot 4

             poorGradesCount++;                                   // uvelichi loshite otcenki s 1


                continue;                                         // da ne idva na dolu ot loshite otcenki
            }

            allGradesSum += currentGrade;                             //pribavqme otcenkata kum calata otcenka allGradesSum
            goodGradesCounts++;                                      // vurti tozi cikul


        }

        double averageScore = allGradesSum / 12;

        if (isExcluded){                                           // ako isExcluded vlezne do nego i e vqrno znachi toi e skusan
            System.out.printf("%s has been excluded at %d grade",student,goodGradesCounts);


        }else {                                                    // ako ne vlezne ne e skusan
            System.out.printf("%s graduated. Average grade: %.2f",student,averageScore);
        }






    }
}
