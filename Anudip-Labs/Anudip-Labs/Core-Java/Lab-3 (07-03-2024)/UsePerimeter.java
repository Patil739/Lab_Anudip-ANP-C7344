/*3. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

Formula:

Perimeter of a square = 4 * s

Perimeter of a rectangle = 2 * (l + b)

Perimeter of a circle = 2 * (22/7) * r 
*/

import java.util.Scanner; //import scanner package
class Perimeter //class 1
{
	public double CalculatePerimeter (double side) //calculating perimeter of square
	{   
	   return 4 * side;
	}
	public double CalculatePerimeter (double l , double w) //calculating perimeter of rectangle
	{
		return 2 * (l+w);
	}
	public double CalculateCirclePerimeter (double radius) //calculating perimeter of square
	{
		return 2 * Math.PI*radius;
	}
}
class UsePerimeter //main class
{
	public static void main (String args []) //main method
	{
		Perimeter pm = new Perimeter (); //object of class 1
		Scanner sc = new Scanner(System.in); //scanner object
		System.out.println("1.Perimeter of Square"); 
		System.out.println("2.Perimeter of Rectangle");
		System.out.println("3.Perimeter of Circle");
		System.out.println("Enter a choice for calculating perimeter");
		
		int s = sc.nextInt();  
		
		switch (s)//switch and case is used executes one statement multiple time 
		{
			case 1:
			System.out.println("Enter Side Length of Square :");//input is taken from user
		    double side = sc.nextDouble();
		    double squarePerimeter = pm.CalculatePerimeter(side);//argument  are passed
		    System.out.println("Perimeter of Square :"+squarePerimeter);
			break;
			
			case 2:
			System.out.println("Enter Length of Rectangle :");//input is taken from user
		    double length = sc.nextDouble();
			System.out.println("Enter Width of Rectangle :");//input is taken from user
			double width = sc.nextDouble();
			double rectanglePerimeter = pm.CalculatePerimeter(length , width);//argument  are passed
		    System.out.println("Perimeter of Rectangle :"+rectanglePerimeter);
			break;
			
			case 3:
			System.out.println("Enter Radius of Circle :");//input is taken from user
		    double radius = sc.nextDouble();
			double circlePerimeter = pm.CalculateCirclePerimeter(radius);//argument  are passed
		    System.out.println("Perimeter of Square :"+circlePerimeter);
			break;
			
			default:
			System.out.println("Invalid");//default 
		}
	}
}

/*Output:
1.Perimeter of Square
2.Perimeter of Rectangle
3.Perimeter of Circle
Enter a choice for calculating perimeter
1
Enter Side Length of Square :
4
Perimeter of Square :16.0
*/