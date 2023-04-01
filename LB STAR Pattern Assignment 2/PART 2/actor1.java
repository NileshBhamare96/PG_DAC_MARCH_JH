class Actor
{
	//data members
	//instance Variable
	String name;
	int age;
	String Status;
	
	//member function
	//constructor

	void Display()
	{
		System.out.println("Actor details:");
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("Status:"+Status);
	}
	
	public static void main(String args[])
	{
		Actor a1=new Actor("Varun Dhawan",34,"Married");
		a1.Display();
	}
}

