public class Pattern_13
{
	public static void main(String arg[])
	{
		for(char c = 'A' ; c <='E' ; c++)
		{
			for(char k = 'E' ; k > c ; k--)
			{
				System.out.print(" ");
			}
			for(char ch = 'A' ; ch <= c ; ch++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}
}