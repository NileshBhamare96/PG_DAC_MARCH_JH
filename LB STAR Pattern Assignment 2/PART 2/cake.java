class Bakery
{
	//Data Members
	String Product_name;
	int quantity;
	String flavour;
	float price;
	
	//Member Functions
	Bakery()
	{
		this.Product_name="None";
		this.quantity=10;
		this.flavour="not defined";
		this.price=0.00f;
	}
	Bakery(String Product_name,int quantity,String flavour,float price)
	{
		this.Product_name=Product_name;
		this.quantity=quantity;
		this.flavour=flavour;
		this.price=price;
	}
	void Display()
	{
		System.out.println("Cake details:");
		System.out.println("========================================");
		System.out.println("Product_Name:"+this.Product_name);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Flavour:"+this.flavour);
		System.out.println("Price:"+this.price);
	}
	public static void main(String args[])
	{
		Bakery b1=new Bakery("Cake",3,"chocolate",600);
		b1.Display();
	}
}
