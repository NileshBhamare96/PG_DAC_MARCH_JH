public class Pattern_9
{
	public static void main(String arg[])
	{
		for(char c = 'A' ; c <= 'E' ; c++)
		{
			for(char ch = 'E' ; ch > c ; ch--)
			{
				System.out.print(" ");
			}
			
			for( char chh = 'A' ; chh <= c ; chh++)
			{
				System.out.print(chh+" ");
			}
			System.out.println();
			
		}
	}
		
}