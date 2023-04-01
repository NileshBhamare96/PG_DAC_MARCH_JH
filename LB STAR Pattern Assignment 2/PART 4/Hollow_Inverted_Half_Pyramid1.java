import java.util.*;
public class Hollow_Inverted_Half_Pyramid1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the No. of Rows and Columns of Square");
	int n = sobj.nextInt();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= n ; j++)
			{
				if((j == 1)||(i == 1)||(i+j == n + 1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}