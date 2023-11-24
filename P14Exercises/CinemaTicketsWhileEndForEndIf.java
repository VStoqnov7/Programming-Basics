package P14Exercises;

import java.util.Scanner;

public class CinemaTicketsWhileEndForEndIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = 0;
        int standard = 0;
        int kids = 0;

        String filmName = scan.nextLine();
        while (!"Finish".equals(filmName)) {
            int places = Integer.parseInt(scan.nextLine());
            int people = 0;
            for (int i = 0; i < places; i++) {
                String command = scan.nextLine();
                if ("student".equals(command)) {
                    students++;
                } else if ("standard".equals(command)) {
                    standard++;
                } else if ("kid".equals(command)) {
                    kids++;
                } else if ("End".equals(command)) {
                    break;
                }
                people++;
            }
            System.out.printf("%s - %.2f%% full.%n", filmName, people * 1.0 / places * 100);
            filmName = scan.nextLine();
        }
        int totalTickets = standard + students + kids;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n",students * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n",standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n",kids * 1.0 / totalTickets * 100);

        }
    }
