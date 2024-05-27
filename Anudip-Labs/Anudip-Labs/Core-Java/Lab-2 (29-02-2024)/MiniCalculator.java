/*1. WAP for creating the mini calculator.  you have to perform an operation on the basis of user choice until the user press yes to continue(add, mul, sub ,div)*/
import java.util.Scanner;//import package
class MiniCalculator//create class
{
    public static void main(String arr[])//main method
	{
        Scanner scanner = new Scanner(System.in);//scanner object
        char choice; // Variable to store user choice to continue or not
        
        do {
            // Input two numbers
            System.out.println("Enter two numbers:");
            double no1 = scanner.nextDouble();
            double no2 = scanner.nextDouble();
            
            // Choose operation
            System.out.println("Choose operation: \n1. + \n2. - \n3. * \n4. / ");
            int operation = scanner.nextInt();
            
            // Perform selected operation and display result
            if (operation == 1) 
			{
                System.out.println("Result: " + (no1 + no2));
            } 
			else if (operation == 2) {
                System.out.println("Result: " + (no1 - no2));
            } 
			else if (operation == 3) {
                System.out.println("Result: " + (no1 * no2));
            } 
			else if (operation == 4) 
			{
                if (no2 != 0) 
				{
                    System.out.println("Result: " + (no1 / no2));
                } else 
				{
                    System.out.println("Cannot divide by zero.");
                }
            } 
			else 
			{
                System.out.println("Invalid operation.");
            }
            
            // Ask user if they want to continue
            System.out.println("Do you want to continue? (yes/no)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // Continue operation if user enters 'yes' 
        
        System.out.println("Calculator closed.");//end
        
    }
}