/*2. Write a program to demonstrate static block take two static variables name and id and  print them.*/

public class StaticDemo//class 
{
    static String name;// Static variables
    static int id;
    // Static block to initialize static variables
    static 
	{
        name = "Bhakti";
        id = 201;
    }
	// Main method to print static variables
    public static void main(String[] args) 
	{
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

/*Output:
Name: Bhakti
ID: 201
*/