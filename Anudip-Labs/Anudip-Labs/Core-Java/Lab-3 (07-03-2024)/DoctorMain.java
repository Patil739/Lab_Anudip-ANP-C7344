/*2. Create a program in java to implement multilevel inheritance and hierarchical inheritance .

Take classes like : Doctor , Surgeon and Nurse

Create methods and show method overriding.
*/
class Doctor //class 1
{
	public void printData() // method printData
	{
		System.out.println("This is Doctor class");
	}
}

class Surgeon extends Doctor //class 2
{
	public void printData() //method printData
	{
		System.out.println("This is Burgeon class Which Extends Doctor class");
	}
}

class Nurse extends Doctor // class 3
{
	public void printData() //method printData 
	{
		System.out.println("This is Nurse class Which Extends Doctor class");
	}
}

class DoctorMain //class 4
{
	public static void main(String args[]) //main method
	{
		Doctor dc=new Doctor(); //object of class 1
		Doctor dcl=new Surgeon(); // object of class 2
		Doctor dc2=new Nurse(); // object of class 3 
        dc.printData(); // calling to method of class 1 
        dcl.printData(); // calling to method of class 2 
        dc2.printData();// calling to method of class 3
	}
}

/*Output:
This is Doctor class
This is Burgeon class Which Extends Doctor class
This is Nurse class Which Extends Doctor class
*/