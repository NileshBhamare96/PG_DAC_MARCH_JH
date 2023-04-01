import java.util.*;

class AreaCalculation
{
	public void CircleArea(float Radius)
	{
		float Carea = 3.14f * Radius * Radius ;
		System.out.println("Area of Circle : "+Carea);
	}
	public void TriangleArea(float Base , float Height)
	{
		float Tarea =  0.5f * Base * Height ;
		System.out.println("Area of Triangle : "+Tarea);
	}
	public void RectangleArea(float Length , float Breadth)
	{
		float Rarea =  Length * Breadth ;
		System.out.println("Area of Rectangle : "+Rarea);
	}
}

public class Area
{
    public static void main(String arg[])
	{
		AreaCalculation Circle = new AreaCalculation();
		AreaCalculation Triangle = new AreaCalculation();
		AreaCalculation Rectangle = new AreaCalculation();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle");
		float Radius = sobj.nextFloat();
		Circle.CircleArea(Radius);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter the Base of Triangle");
		float Base = sobj.nextFloat();
		System.out.println("Enter the Height of Triangle");
		float Height = sobj.nextFloat();
	    Triangle.TriangleArea(Base , Height);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter the Length of Rectangle");
		float Length = sobj.nextFloat();
		System.out.println("Enter the Height of Rectangle");
		float Breadth = sobj.nextFloat();
		Rectangle.RectangleArea(Length,Breadth);
		
		System.out.println("------------------------------------------------");

	}
}