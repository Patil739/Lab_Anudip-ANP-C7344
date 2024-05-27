/*3.A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then 
categorizes the BMI into underweight, normal, overweight, or obese categories using if-else statements.*/

import java.util.Scanner;//import Scanner package
public class BMICalculator //creating class
{
    public static void main(String[] args) //main method
	{
        Scanner sc = new Scanner(System.in);//object for Scanner

        // Prompt user for weight 
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();

        // Prompt user for height 
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Categorize BMI
        String category;
        if (bmi < 18.5) 
		{
            category = "Underweight";
        } 
		else if (bmi >= 18.5 && bmi < 25) 
		{
            category = "Normal weight";
        } 
		else if (bmi >= 25 && bmi < 30) 
		{
            category = "Overweight";
        } 
		else 
		{
            category = "Obese";
        }
		// Display BMI and category
        System.out.println("Your BMI is:" + bmi);
        System.out.println("Category: " + category);
	}
}