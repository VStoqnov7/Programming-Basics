package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Четем от конзолата
        //2.Пресмятаме цената на продуктите
                  //Пълната цена на химикали
                  // Пълната цена на маркери
                  //Пълната цена на препарати
                 //Цената за всички материали
                //Изчисляваме финалната сума като пресметнем намалението
        //3.Принтиране


        int countPenPacket  = Integer.parseInt(scanner.nextLine());
        int countHighlighters = Integer.parseInt(scanner.nextLine());
        int cleaningAgent  = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double priceForPens = countPenPacket * 5.80;
        double priceForHighlighter = countHighlighters * 7.20;
        double priceForCleaningAgent = cleaningAgent * 1.20;

        double sumWithoutDiscount = priceForPens + priceForHighlighter + priceForCleaningAgent;


        double finalSum =sumWithoutDiscount - (sumWithoutDiscount * (discount/100.0));


        System.out.println(finalSum);









    }


    public static class RectangleArea {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            // Прочитане на входни данни
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            // Presmqtane na liceto na pravougalnika
            int area = a * b ;

            // Printirane na rezultata
            System.out.println(area);


        }
    }
}
