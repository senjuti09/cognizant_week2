package student;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentGrades {
    private LinkedHashMap<Integer, Student> students;

    public StudentGrades() {
        students = new LinkedHashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public boolean removeStudent(int studentId) {
        return students.remove(studentId) != null;
    }

    public boolean updateStudentGrade(int studentId, char newGrade) {
        Student student = students.get(studentId);
        if (student != null) {
            student.setGrade(newGrade);
            return true;
        }
        return false;
    }

    public void displayStudents() {
        System.out.println("Student Grades:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
