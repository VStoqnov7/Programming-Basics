package P4ConditionalStatements2;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60 + minutes) + 15;

        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours >= 24){
            newHours = 0;
            System.out.printf("%d:%02d",newHours,newMinutes);
        }else {
            System.out.printf("%d:%02d",newHours,newMinutes);
        }

    }

    public static class Suma {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = num1 + num2;

                    System.out.println(num1 + num2);

        }
    }
}
