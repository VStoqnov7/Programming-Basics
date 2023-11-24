package P5ConditionalStatementsAdvanced;

import java.util.Scanner;

public class AnimalType3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        switch (name) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "tortoise":
            case "crocodile":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
