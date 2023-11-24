package P8ForLoop2;

import java.util.Scanner;

public class TrekkingMania_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());

        int people1 = 0;
        int people2 = 0;
        int people3 = 0;
        int people4 = 0;
        int people5 = 0;

        int numberOfPeople = 0;



        for (int i = 1; i <= numberPeople ; i++) {
            int numberGroup = Integer.parseInt(scanner.nextLine());
            numberOfPeople += numberGroup;

            if (numberGroup <= 5) {
                people1 += numberGroup;
            } else if (numberGroup <= 12) {
                people2 += numberGroup;

            } else if (numberGroup <= 25) {
                people3 += numberGroup;

            } else if (numberGroup <= 40) {
                people4 += numberGroup;

            } else {
                people5 += numberGroup;
            }
        }


        double people1Percent = 1.0 * people1 / numberOfPeople * 100;
        double people2Percent = 1.0 * people2 / numberOfPeople * 100;
        double people3Percent = 1.0 * people3 / numberOfPeople * 100;
        double people4Percent = 1.0 * people4 / numberOfPeople * 100;
        double people5Percent = 1.0 * people5 / numberOfPeople * 100;

        System.out.printf("%.2f%%%n",people1Percent);
        System.out.printf("%.2f%%%n",people2Percent);
        System.out.printf("%.2f%%%n",people3Percent);
        System.out.printf("%.2f%%%n",people4Percent);
        System.out.printf("%.2f%%",people5Percent);




    }
}

