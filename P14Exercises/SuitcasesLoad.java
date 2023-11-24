package P14Exercises;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cap = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double baggage = 0;

        while (!command.equals("End")){

            double volume = Double.parseDouble(command);

            if (volume % 3 == 1){
                volume = volume + volume * 0.10;
            }
            cap -= volume;
            if (cap <= 0){
                break;
            }


            baggage++;
            command = scanner.nextLine();
        }

        if (command.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");

        }

        System.out.printf("Statistic: %.0f suitcases loaded.",baggage);

    }
}
