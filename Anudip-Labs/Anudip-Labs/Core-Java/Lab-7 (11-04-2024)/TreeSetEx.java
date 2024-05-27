/*3.Write a program using TreeSet insert Integer values and print them*/
package com.thusdaylab;
import java.util.TreeSet;
public class TreeSetEx //class 
{
	public static void main(String arr[]) //main method
	{
		TreeSet<Integer> intSet = new TreeSet<>();

	        // Inserting integer values into the TreeSet
	        intSet.add(4);
	        intSet.add(8);
	        intSet.add(10);
	        intSet.add(2);
	        intSet.add(1);

	        // Printing the integer values 
	        System.out.println(" All Integer values:"+intSet);
	        }
	}
/*output: All Integer values:[1, 2, 4, 8, 10]*/