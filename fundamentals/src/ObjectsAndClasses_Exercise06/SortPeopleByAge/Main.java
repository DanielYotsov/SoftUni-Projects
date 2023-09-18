package ObjectsAndClasses_Exercise06.SortPeopleByAge;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person2> people = new ArrayList<>();

        String line = "";
        while (!line.equals("End")) {
            line = scanner.nextLine();
            if (!line.equals("End")) {
                String[] data = line.split(" ");
                String name = data[0];
                String ID = data[1];
                int age = Integer.parseInt(data[2]);
                people.add(new Person2(name, ID, age));
            }
        }

        // Sort the people based on age
        people.sort(Comparator.comparingInt(p -> p.age));

        // Print the sorted people
        for (Person2 person : people) {
            System.out.println(person);
        }
    }
}
