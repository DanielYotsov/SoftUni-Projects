package ObjectsAndClasses_Exercise06.Students;


public class StudentSorter {


    // Student class with properties and constructor
    public static class Student {
        private final String firstName;
        private final String lastName;
        private final double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ": " + String.format("%.2f", grade);
        }
    }
}
