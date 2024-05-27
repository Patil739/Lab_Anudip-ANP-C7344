/*4. Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and a method stop() that prints "Car stopped".*/

class Car //creating the class
{
	void carDetails() //get method to take the input from user
	{
	  int make=2021; //Attributes of Book class
	  String model="thar";
	  int year=2024;
	  String color="black";
	  System.out.println("Make: " +make + " Model: " + model + " Year: " + year + " Color: " + color);
	}
	void start()//set method to set the values to the attributes
	{
		System.out.println("Car start");
	}
	void stop()
	{
		System.out.println("Car stop");
	}
	
	public static void main(String arr[]) //main method
	{
		Car c1=new Car(); //creating the object of class
		c1.carDetails(); //call get method
		c1.start();
		c1.stop();
	}
}

/*Output:
Make: 2021 Model: thar Year: 2024 Color: black
Car start
Car stop
*/