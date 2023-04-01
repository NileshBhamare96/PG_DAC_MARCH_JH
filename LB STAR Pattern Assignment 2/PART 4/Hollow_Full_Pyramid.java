import java.util.*;

public class Hollow_Full_Pyramid
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the No. of Rows and Columns of Square");
		int n = sobj.nextInt();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int k = n ; k > i ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++)
			{
				if(i == n || j == 1 )
			        System.out.print("* ");
			    else if( j != i)
					System.out.print(" ");
				
					System.out.print(" *");
					
			}
			
			System.out.println();
		}
	}
}

//if(i == n || j == 1 || j == n-1)
			       // System.out.print("* ");