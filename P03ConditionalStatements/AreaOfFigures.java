package P03ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")){
            // •Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f",area);

    } else if (figure.equals("rectangle")){
            //•	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            double area = a * b;
            System.out.printf("%.3f",area);

        } else if (figure.equals("circle")) {
        //    •	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
            double r = Double.parseDouble(scanner.nextLine());

            double area = Math.PI * Math.pow(r,2);
            System.out.printf("%.3f", area);



            } else if (figure.equals("triangle")) {
            // •	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.next());

            double area = a * h / 2;
            System.out.printf("%.3f", area);
        }
    }
    }
