package com.threadpackage;

	import java.util.ArrayList;

	public class EvenNumSum //main class
	{
	    public static void main(String[] args) //main method
	    {
	        // Sample input: ArrayList of integers
	        ArrayList<Integer> num = new ArrayList<>();
	        num.add(1);
	        num.add(5);
	        num.add(8);
	        num.add(11);
	        num.add(14);

	        // Calculate the sum of even numbers
	        int sum = 0;
	        for (int number : num)
	        {
	            if (number % 2 == 0) 
	            {
	                sum += number;
	            }
	        }

	        // Output the sum of even numbers
	        System.out.println("Sum of even numbers is: " + sum);
	    }
	}
	
/*Output:
	Sum of even numbers is: 22
*/