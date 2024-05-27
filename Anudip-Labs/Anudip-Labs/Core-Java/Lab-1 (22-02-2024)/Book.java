/*2. Create a class named Book with attributes title, author, ISBN, and price. Include methods to get and set the attributes.*/

import java.util.Scanner;//import scanner package

class Book //creating the class
{
	String title; //Attributes of Book class
	String author;
	int ISBN;
	int price;
	void get() //get method to take the input from user
	{
		Scanner sc=new Scanner(System.in); //create scanner object to read or take the input from user
		System.out.println("Enter Book Title:");
		this.title=sc.next();
		System.out.println("Enter Book Author:");
		this.author=sc.next();
		System.out.println("Enter ISBN:");
		this.ISBN=sc.nextInt();
		System.out.println("Enter Book Price:");
		this.price=sc.nextInt();
	}
	void set()//set method to set the values to the attributes
	{
		System.out.println("Title: " + this.title + " Author: " + this.author + " ISBN: " + this.ISBN + " Price: " + price);
	}
	
	public static void main(String arr[]) //main method
	{
		Book b1=new Book(); //creating the object of class
		b1.get(); //call get method
		b1.set(); //call set method
		
		
	}
	
}