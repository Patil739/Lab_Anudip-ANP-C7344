/*1.Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes*/

class Address //class 1
{
	String street; //attributes
    String city;
    String state;
    int zipcode;
	
    Address() // no argument constructor
    {
		this.street= "Pandharpur"; //default value to the attributes
		this.city ="Solapur";
		this.state ="Maharashtra";
		this.zipcode= 414003;
	}
	public void printData()//printData method
	{
		System.out.println("Street : " +this.street+" City : "+this.city+" state "+this.state+" zip Code "+this.zipcode); 
	}
	Address (String s, String c, String st, int zc)//parameterized constructor
	{
		this.street=s;
		this.city=c;
		this.state = st;
		this.zipcode=zc;
	}
	public void method()//method method
	{
		System.out.println("Street: "+this.street+" city "+this.city+" state "+this.state+" zipcode: "+this.zipcode);
	}
}
class AddressMain //main class
{
	public static void main(String[] args) // main method
	{
		Address ob=new Address ();//object for no argument constructor 
	    ob.printData();//calling the printData method
	    Address obl = new Address ("Pune Road", "Solapur", "Maharashtra", 414603);//object for parameterized constructor
        ob.method();
	}
}

