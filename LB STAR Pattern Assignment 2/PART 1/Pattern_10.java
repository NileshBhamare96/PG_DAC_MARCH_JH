public class Pattern_10
{
	public static void main(String arg[])
	{
		for(char c = 'E' ; c >= 'A' ; c--)
		{
			for(char ch = 'A' ; ch < c ; ch++)
			{
				System.out.print(" ");
			}
			
			for(char chh = 'E' ; chh >= c ; chh--)
			{
				System.out.print(chh+" ");
			}
			
			System.out.println();
			
		}
	}
		
}