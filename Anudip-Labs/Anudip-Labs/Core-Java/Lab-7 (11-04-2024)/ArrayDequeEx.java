/*2. Write a program using ArrayDeque to add book names and add, delete the values from both ends of queue.*/
package com.thusdaylab;

	import java.util.ArrayDeque;

	public class ArrayDequeEx//class
	{
	    public static void main(String arr[])//main method
	    {
	        ArrayDeque<String> bookQueue = new ArrayDeque<>();

	        // Adding book names to the queue
	        bookQueue.add("Book1");
	        bookQueue.add("Book2");
	        bookQueue.add("Book3");

	        // Printing book names in the queue
	        System.out.println("Books in the queue:"+bookQueue);

	        // Adding a book at the front of the queue
	        bookQueue.addFirst("New Book");

	        // Deleting a book from the end of the queue
	        String removedBook = bookQueue.removeLast();

	        // Printing the updated queue
	        System.out.println("Updated Books in the queue:"+bookQueue);

	        System.out.println("Removed book: " + removedBook);
	    }
	}
/*Output:Books in the queue:[Book1, Book2, Book3]
Updated Books in the queue:[New Book, Book1, Book2]
Removed book: Book3*/