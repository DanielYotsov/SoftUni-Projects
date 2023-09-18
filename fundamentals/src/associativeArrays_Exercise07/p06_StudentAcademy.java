package associativeArrays_Exercise07;

import java.util.*;

public class p06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry -> име (String) + списък с оценки (list<double>)
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade (grades);
            if(averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
