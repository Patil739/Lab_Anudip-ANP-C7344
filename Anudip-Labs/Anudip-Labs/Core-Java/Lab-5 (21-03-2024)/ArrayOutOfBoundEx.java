/*2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException

while accessing elements in an array.

[Hint: Use array and loop and try to access the element beyond the last index]*/
package com.exception;

public class ArrayOutOfBoundEx//crating class
{

	public static void main(String[] args)//main method 
	{
		// TODO Auto-generated method stub
		        int[] array = {1, 2, 3}; // Array with 3 elements

		        // Trying to access elements beyond the last index
		        for (int i = 0; i <= array.length; i++)
		        {
		            System.out.println(array[i]);
		        }
		    }
		}

	
/*Output:
 1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at Threading/com.exception.ArrayOutOfBoundEx.main(ArrayOutOfBoundEx.java:19)
 */