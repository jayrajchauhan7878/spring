package june01.studentmanagement;

import java.util.List;
import java.util.Map;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private List<String> courses;
    private Map<String,String> grade;

    public Student(){

    }

    public Student(int studentId, String firstName, String lastName, List<String> courses, Map<String, String> grade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Map<String, String> getGrade() {
        return grade;
    }

    public void setGrade(Map<String, String> grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                ", grade=" + grade +
                '}';
    }
}
