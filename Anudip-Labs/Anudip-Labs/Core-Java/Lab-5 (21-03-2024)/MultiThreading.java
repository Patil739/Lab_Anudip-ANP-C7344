
/*1. Create two thread.one thread is finding the average of the first 10 numbers and

another thread is printing the square of the number stored in array arr={1,20,50,15,30}

and make sure both threads can execute simultaneously.*/
package com.threadpackage;

public class MultiThreading //main class
{
	public static void main(String[] args) //main method
	    {
	        int[] arr = {1, 20, 50, 15, 30};//creating array

	        // Thread to find the average of the first 10 numbers
	        Thread averageThread = new Thread(() -> {
	            int sum = 0;
	            for (int i = 1; i <= 10; i++)
	            {
	                sum += i;
	            }
	            double average = (double) sum / 10;
	            System.out.println("Average of first 10 numbers: " + average);
	        });

	        // Thread to print the square of the numbers
	        Thread squareThread = new Thread(() -> {
	            System.out.print("Squares of numbers in array: ");
	            for (int num : arr) 
	            {
	                System.out.print(num * num + " ");
	            }
	            System.out.println();
	        });

	        // Start both threads
	        averageThread.start();
	        squareThread.start();
	    }
	}


/*Output:
 Squares of numbers in array: 1 400 2500 225 900 
Average of first 10 numbers: 5.5
*/
