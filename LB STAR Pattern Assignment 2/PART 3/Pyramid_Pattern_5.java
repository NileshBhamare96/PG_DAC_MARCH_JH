public class Pyramid_Pattern_5
{
	public static void main(String arg[])
	{
		for(int i = 9 ; i >= 1  ; i--)
		{
			for(int k = 1 ; k < i ; k++)
			{
				System.out.print("  ");
			}	
			for(int j = 9 ; j >= i ; j--)
			{
				System.out.print(j+" ");
			}
			for(int j = 9 ; j > i ; j--)
			{
			System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}