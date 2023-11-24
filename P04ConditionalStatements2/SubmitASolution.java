package P04ConditionalStatements2;

import java.util.Scanner;

public class SubmitASolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int second1 =Integer.parseInt(scanner.nextLine());
        int second2 =Integer.parseInt(scanner.nextLine());
        int second3 =Integer.parseInt(scanner.nextLine());

        int totalSeconds = second1 + second2 + second3;

        int minutes = totalSeconds / 60;
        int  seconds = totalSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d",minutes,seconds);
        }else {
            System.out.printf("%d:%d",minutes,seconds);

        }

    }
}
