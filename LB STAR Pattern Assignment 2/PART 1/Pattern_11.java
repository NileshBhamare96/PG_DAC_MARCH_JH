public class Pattern_11
{
	public static void main(String arg[])
	{
		for(int i = 1 ; i<= 5 ; i++)
		{
			for(int k = 5 ; k > i ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++  )
			{
				System.out.print("*");
			}
			// for(int P = 1 ; P < i ; P++  )
			// {
			// 	System.out.print("*");
			// }
			
			System.out.println();
			
		}
	}
}