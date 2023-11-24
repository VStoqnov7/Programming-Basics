package P06ConditionalStatementsAdvanced2;

import java.util.Scanner;

public class NewHouse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        //  "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        //цвете	Роза :     	Далия	Лале	Нарцис	Гладиола
        //Цена на брой в лева	5	3.80	2.80	3	2.50

        double price = 0 ;


        switch (flowers) {
            case "Roses":
                price = countFlowers * 5;
                 if ( countFlowers > 80){
                    price = price - price * 0.1;

                }
                 break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers > 90){
                    price = price - price * 0.15;
                }
                break;

            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers > 80){
                    price = price - price * 0.15;
                }
                break;

            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120){
                    price = price + price * 0.15;
                }
                break;

            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers < 80){
                    price = price + price * 0.2;
                }
                break;
        }

        double difference = Math.abs(budget - price);

        if ( price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,flowers,difference);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",difference);
        }



    }
}
