package associativeArrays_Exercise07;

import java.util.*;

public class p05_courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] parts = input.split(" : ");
            String courseName = parts[0];
            String studentName = parts[1];
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(studentName);

           // courses.putIfAbsent(courseName, new ArrayList<>());second method.
           // courses.get(courseName).add(studentName);second method.

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            String courseName = entry.getKey();
            List<String> registeredStudents = entry.getValue();
            System.out.println(courseName + ": " + registeredStudents.size());
            for (String student : registeredStudents) {
                System.out.println("-- " + student);
            }
        }
    }
}