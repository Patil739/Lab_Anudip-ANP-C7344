/*4. Create a base class with constructor and inherit it in the derived class and 
call the base class constructor in derived class.*/

class Base // Base class
{
    // Constructor of the base class
    public Base() 
	{
        System.out.println("Constructor of Base Class called!!");
    }
}
// Derived class inheriting from the base class
class Derived extends Base  // Constructor of the derived class
{
    public Derived() 
	{
        
		System.out.println("Constructor of Derived Class called!!");
    }
}
public class MainDemo //main class
{
    public static void main(String[] args) //main method
	{
        Derived ob = new Derived();// Creating an object of the derived class
    }
}

/*Output:
Constructor of BaseClass called!!
Constructor of DerivedClass called!!
*/