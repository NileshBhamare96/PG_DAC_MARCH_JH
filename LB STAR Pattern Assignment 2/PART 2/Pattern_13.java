public class Pattern_13 
{
    public static void main(String arg[])
	{
		for(int i = 1 ; i<= 5 ; i++)
		{
			for(int k = 1 ; k < i ; k++)
		    {
		     	  System.out.print(" ");
		    }
		
	     	for(int j = 5 ; j >= i ; j--)
		    {
	     		System.out.print("*");
     		}
		    System.out.println();
        }
        for(int i = 1 ; i<= 5 ; i++)
		{
			for(int k = 5 ; k > i ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }
	
    
}
