public class Pyramid_Pattern_2
{
	public static void main(String arg[])
	{
		for(int i = 1 ; i <= 9 ; i++)
		{
			for(int k = 9 ; k > i ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
	