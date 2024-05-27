/*Create One to Many mapping(Bidirectional)  between Course & Instructor  & perform all CRUD Operations.
*/ 
package com.demo.OneToMany_Bidirectional;

import Dao.CourseDao;
import Dao.InstructorDao;
import Entity.Course;
import Entity.Instructor;

public class App 
{
    public static void main( String[] args )
    {
    	InstructorDao instructordao=new InstructorDao();
    	CourseDao coursedao=new CourseDao();
    	Instructor instructor=new Instructor("Bhakti","Mandavkar","bhaktim@gmail.com");
    	instructordao.saveInstructor(instructor);
    	Course course1=new Course("First Year",instructor);
    	coursedao.saveCourse(course1);
    	Course course2=new Course("Second Year",instructor);
    	coursedao.saveCourse(course2);
    	Course course3=new Course("Last Year",instructor);
    	coursedao.saveCourse(course3);
    	
    	
    	instructor=instructordao.getInstructor(1);
        System.out.println("Instructor ID:"+instructor.getId()+" "+"Instructor FirstName:"+instructor.getFirstName()+" "+"Instructor LastName:"+instructor.getLastName()+"Instructor email:"+instructor.getEmail());
        
        
   }
    } 	
    

