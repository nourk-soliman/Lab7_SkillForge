/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import User.*;
import Json.JsonUserReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nour
 */
public class InstructorRole {
   
   
    public List<Student> viewEnrolledStudents(Instructor i)
   {JsonUserReader r =new JsonUserReader("users.json");
    List<Student> temp=r.getStudents();
   List<Student> result=new ArrayList<>();
   for(Student student: temp)
   {
   for(String enrolledCourse: student.getEnrolledCourses() )
   {if(i.getCreatedCourses().contains(enrolledCourse))
   result.add(student); break;}}
   return result;  }
    
    
    

}
