import java.util.Scanner;
class LCMOrimeFactor
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int iNo1 =sobj.nextInt();
		
		System.out.println("Enter the second number:");
		int iNo2=sobj.nextInt();
		
		int small=(iNo1<iNo2)?iNo1:iNo2;
		
		int count=1,GCD=0;
		
		while(count<=iNo1)
		{
			if((iNo1%count==0)&&(iNo2%count==0))
			{
				GCD=count;
			}
			count++;
		}
		System.out.println("GCD of a number is:"+GCD);
		int LCM=(iNo1*iNo2)/GCD;
		System.out.println("LCM of a number is:"+LCM);
		
	}
}
		
		