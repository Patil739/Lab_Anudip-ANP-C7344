
import java.util.Scanner; //import scanner package
class SimpleCalculator //creating the class
 {
    public static void main(String[] args) //main method
	{
        Scanner scanner = new Scanner(System.in); //create scanner object to read or take the input from user

        System.out.print("Enter first number: "); //promt the user to enter first no
        double no1 = scanner.nextDouble(); //read the first no enter by the user

        System.out.print("Enter second number: "); //promt the user to enter second no
        double no2 = scanner.nextDouble(); //read the second no enter by the user

        System.out.print("Enter operator:"); //promt the user to enter operator
        char op = scanner.next().charAt(0); //read the operator enter by the user

        double result=0; //result variable store the result of the operation
       //perform the corresponding operations
        if (op == '+') 
		{
            result = no1 + no2;//addition
        } 
		else if (op == '-')
		{
            result = no1 - no2;//subtraction
        } 
		else if (op == '*') 
		{
            result = no1 * no2;//multiplication
        } 
		else if (op == '/') 
		{
            if (no2 != 0)
			{
                result = no1 / no2;//division
            } 
        } 
		System.out.println("Result: " + result);
		//display the result of the arithmetic operation
    }
}