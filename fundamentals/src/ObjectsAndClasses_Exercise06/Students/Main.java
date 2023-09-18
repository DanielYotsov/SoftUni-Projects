package ObjectsAndClasses_Exercise06.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<StudentSorter.Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            StudentSorter.Student student = new StudentSorter.Student(firstName, lastName, grade);
            students.add(student);
        }

        // Sort the students by grade in descending order
        students.sort(Comparator.comparing(StudentSorter.Student::getGrade).reversed());

        // Print the sorted students
        for (StudentSorter.Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
