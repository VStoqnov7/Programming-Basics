package P02FirstStepsInCodingExercise;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Четем от конзолата
        //1.	Дължина, ширината,височината,процент
        //2.Пресмятане обема на аквариума
        //3.Пресмятаве обема в летри
        //4.Пресмятаме колко литри са ни нужни / пълните литри (1-0.17)
        //5.Принтиране


        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * wight * height;
        double fullTankLiters = volume * 0.001;
        double neededLiters = fullTankLiters * (1-percent/100);

        System.out.println(neededLiters);

    }


















}
