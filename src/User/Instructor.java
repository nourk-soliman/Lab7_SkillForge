/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import Courses.*;
import java.util.ArrayList;
import java.util.List;
import Json.JsonUserReader;
import User.Student;

/**
 *
 * @author Nour Khaled
 */
public class Instructor extends User  {
    
    private List<String> createdCourses;
    public Instructor(int userId,String username,String email,String passwordHash)
    {
    super(userId,username,email,passwordHash);
   
    createdCourses=new ArrayList<>();
    
    }
    public Instructor(){}
    
        
   public List<Student> viewEnrolledStudents()
   {JsonUserReader r =new JsonUserReader("users.json");
    List<Student> temp=r.getStudents();
   List<Student> result=new ArrayList<>();
   for(Student student: temp)
   {
   for(String enrolledCourse: student.getEnrolledCourses() )
   {if(createdCourses.contains(enrolledCourse))
   result.add(student); break;}}
   return result;  }
    
 
    public List<String> getCreatedCourses() {
        return createdCourses;
    }

    public void setCreatedCourses(List<String> createdCourses) {
        this.createdCourses = createdCourses;
    }
    @Override
    public void displayInfo()
    {System.out.println("=== Instructor Info ===");
        super.displayInfo(); // print User info
        System.out.println("Created Courses: " + createdCourses);
        System.out.println("======================");
    
    
    }
    
   
  
 
    public static void main(String[] args) {
        int k=0;
        JsonUserReader r=new JsonUserReader("users.json");
      List<Instructor> i=r.getInstructors();
      for(Instructor instructor:i)
      {instructor.displayInfo();}
      List<Student> s=i.get(0).viewEnrolledStudents();
      for(Student student:s )
      {student.displayInfo();
          System.out.println(k++);
   }
        
    }
}
