/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Courses.Course;
import Json.JsonUserReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nour
 */
public class InstructorRole {
   List<Instructor>instructors;
   JsonUserReader r =new JsonUserReader("users.json");
    public void loadInstructors()
    {
    instructors=r.getInstructors();}
    
    
    

}
