package P01FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на входа
        String name = scanner.nextLine();
                int projects = Integer.parseInt(scanner.nextLine());
        //Изчисления
        int neededTime = projects * 3;
        //Принтиране на резултати
        System.out.printf("The architect %s will need %d hours to complete %d project/s.%n",
                name,neededTime,projects);



    }
}
