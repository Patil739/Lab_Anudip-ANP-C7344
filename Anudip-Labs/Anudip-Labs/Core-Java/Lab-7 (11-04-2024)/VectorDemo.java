/*1Write a program using Vector to store the list of students details and print the details.*/
package com.thusdaylab;
import java.util.Vector;

public class VectorDemo //class
{
	public static void main(String arr[]) //main method
	{
		Vector<String> students = new Vector<>();//crating vector
		// Adding students' details to the vector
		        students.add("1.Bhakti Mandavkar");
		        students.add("2.Pallavi Lokhande");
		        students.add("3.Megha Lokhande");

		        // Printing All students
		        System.out.println("All Students:"+students);
		        }
}
/*All Students:[1.Bhakti Mandavkar, 2.Pallavi Lokhande, 3.Megha Lokhande]*/
