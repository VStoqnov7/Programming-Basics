package P14Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());

        double groupMus = 0;
        double groupMon = 0;
        double groupKil = 0;
        double groupK2 = 0;
        double groupEverest = 0;

        double totalGroup = 0;



        for (int i = 1; i <= group ; i++) {

            int numberGroup = Integer.parseInt(scanner.nextLine());


            if (numberGroup > 0 && numberGroup <= 5){
                groupMus += numberGroup;
                totalGroup += numberGroup;


            } else if (numberGroup > 5 && numberGroup <= 12) {
                groupMon += numberGroup;
                totalGroup += numberGroup;
                
            } else if (numberGroup > 12 && numberGroup <= 25) {
                groupKil += numberGroup;
                totalGroup += numberGroup;
                
            } else if (numberGroup > 25 && numberGroup <= 40) {
                groupK2 += numberGroup;
                totalGroup += numberGroup;
                
            } else if (numberGroup > 40) {
                groupEverest += numberGroup;
                totalGroup += numberGroup;
                
            }


        }


        System.out.printf("%.2f%%%n",groupMus / totalGroup * 100);
        System.out.printf("%.2f%%%n",groupMon / totalGroup * 100);
        System.out.printf("%.2f%%%n",groupKil / totalGroup * 100);
        System.out.printf("%.2f%%%n",groupK2 / totalGroup * 100);
        System.out.printf("%.2f%%%n",groupEverest / totalGroup * 100);








    }
}
