
import java.util.* ;

public class SwapNumbers
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter Second Number");
		int iNo2 = sobj.nextInt();
		
		iNo1 = iNo1 + iNo2 ;
		iNo2 = iNo1 - iNo2 ;
		iNo1 = iNo1 - iNo2 ;
		
		System.out.println("------------------After Swapping-------------------------");
		System.out.println("First Number = "+iNo1);
		System.out.println("Second Number = "+iNo2);
		
	}
}

