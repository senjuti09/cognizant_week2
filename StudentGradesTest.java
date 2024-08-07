package student;
public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        // Add students
        grades.addStudent(new Student(1, "John", 'A'));
        grades.addStudent(new Student(2, "Jane", 'B'));

        // Display students
        grades.displayStudents();

        // Update student grade
        grades.updateStudentGrade(1, 'A');

        // Display students again
        grades.displayStudents();

        // Remove a student
        grades.removeStudent(2);

        // Display students again
        grades.displayStudents();
    }
}
