package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class ProjectsCreation_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Името на архитекта - текст
        String name = scanner.nextLine();
        //2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
        int projects = Integer.parseInt(scanner.nextLine());
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        System.out.printf("The architect " + name + " will need " + (projects * 3) + " hours to complete " + projects + " project/s.");
    }
}
