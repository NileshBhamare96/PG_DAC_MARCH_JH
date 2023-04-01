import java.util.* ;
public class Elections 
{
    public static void main(String args[])
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Choose the Option Between 1 and 0 \n");
		
		//1.check nationality is indian or not
		System.out.println(" Indian : 1 \n other  : 0");
		int nationality=sobj.nextInt();

		//3.check Educated or not
		System.out.println(" Literate  : 1 \n Iliterate : 0");
		int lit = sobj.nextInt();
		
		//4.take the age from user
		System.out.println("Enter the age:");
		int age=sobj.nextInt();
		
		//5.condition
		String voter=(age >= 18 && nationality== 1 && lit == 1) ?"Eligible":"Not-Eligible";
		System.out.println(voter);

	}		
    
}
