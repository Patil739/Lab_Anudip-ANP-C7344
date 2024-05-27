/*3.Create a class named Employee with attributes name, employeeId, designation, and salary.   Include a method calculateBonus() that returns 5% of the salary as bonus.*/
import java.util.Scanner;//import scanner package
class Employee//Creating the class
{
	String name; //Attributes of Employee class
	int employeeId;
	String designation;
	double salary;
	
	Scanner sc=new Scanner(System.in); //create scanner object to read or take the input from user
	{
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee Id:");
		employeeId=sc.nextInt();
		System.out.println("Enter Destination:");
		designation=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextDouble();
	}
	
    void calculateBonus()//creating method that returns 5% of the salary as bonus
	{
		double bonus=0.05*salary;
		System.out.println("Your Bonus is:"+bonus);
	}
	public static void main(String arr[])//main method
	{
		Employee e1=new Employee();//creating the object of class
		e1.calculateBonus();//call the calculateBonus method
	}
}