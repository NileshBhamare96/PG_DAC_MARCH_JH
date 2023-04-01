import java.util.*;

public class Circle
{
	float Radius ;
	
	public void CircleArea(float Radius)
	{
		float Carea = 3.14f * Radius * Radius ;
		System.out.println("Area of Circle : "+Carea);
	}
	
    public static void main(String arg[])
	{
		Circle Cobj = new Circle();
        Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle");
		float Radius = sobj.nextFloat();
		
		Cobj.CircleArea(Radius);	
	}
}