package User;

import java.util.ArrayList;
import java.util.List;
import Json.JsonUserReader;
public class Student extends User {

    private List<String> enrolledCourses;

    // Default constructor required by Gson
    public Student() {
        this.enrolledCourses = new ArrayList<>();
    }

    public Student(int id, String name, String password, String role, List<String> courses) {
        super(id, name, password, role);
        this.enrolledCourses = courses;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourse(String courseName) {
        enrolledCourses.add(courseName);
    }

    public void displayInfo() {
      super.displayInfo();
        System.out.println("Courses: " + enrolledCourses);
    }
    
    /*public static void main(String[] args) {
        JsonUserReader r=new JsonUserReader("users.json");
        List<Student> l=r.getStudents();
        for(Student s: l)
            s.displayInfo();
        
    }*/
}
