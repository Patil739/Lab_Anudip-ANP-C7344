/*3.  Create a class Student and implement array and display details of student.*/

class Student //class
{
    String name;//attributes
    int age;
    String branch;
	String address;
	public static void main(String[] args)//main method
	{
        // Creating an array to store student objects
        Student[] st = new Student[3];

        // Adding student objects to the array
        st[0] = new Student();
        st[0].name = "Bhakti";
        st[0].age = 21;
        st[0].branch = "Computer Science";
		st[0].address= "Ahmednagar";

        st[1] = new Student();
        st[1].name = "Aishwarya";
        st[1].age = 22;
        st[1].branch = "Information Technology";
		st[1].address= "Pune";

        st[2] = new Student();
        st[2].name = "Amruta";
        st[2].age = 21;
        st[2].branch = "E&TC";
		st[2].address= "Solapur";

        // Displaying details of all students
        for (int i = 0; i < st.length; i++) 
		{
            System.out.println("1.Name: " + st[i].name);//print array
            System.out.println("2.Age: " + st[i].age);
            System.out.println("3.Branch: " + st[i].branch);
			System.out.println("4.Address: " + st[i].address);
        }
    }
}

/*Output:
1.Name: Bhakti
2.Age: 21
3.Branch: Computer Science
4.Address: Ahmednagar
1.Name: Aishwarya
2.Age: 22
3.Branch: Information Technology
4.Address: Pune
1.Name: Amruta
2.Age: 21
3.Branch: E&TC
4.Address: Solapur
*/