package com.threadpackage;
import java.util.Stack;

public class StackDemo //main class
{
	    public static void main(String[] args) //main method
	    {
	        // Declare a stack
	        Stack<Integer> stack = new Stack<>();

	        // Store 10 elements into the stack
	        for (int i = 1; i <= 10; i++) 
	        {
	            stack.push(i);
	        }

	        // Remove 4 elements from the stack and display them
	        System.out.println("Elements removed from the stack:");
	        for (int i = 0; i < 4; i++) 
	        {
	            int removedElement = stack.pop();
	            System.out.println(removedElement);
	        }
	    }
	}

/*Output:
Elements removed from the stack:
10
9
8
7*/
 