/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;
import Json.JsonUserReader;
import User.Instructor;
import java.util.List;
/**
 *
 * @author Nour
 */
public class NewClass {
    public static void main(String[] args) {
       
        JsonUserReader r=new JsonUserReader("users.json");
         List<Instructor> i= r.getInstructors();
         for(Instructor inst:i)
        inst.displayInfo();
    }
}
