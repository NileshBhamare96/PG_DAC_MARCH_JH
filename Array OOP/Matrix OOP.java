import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		//1)declare Scanner
		Scanner sc=new Scanner(System.in);
		//2)declared rows and col
		System.out.println("Enter the number of Rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of cols:");
		int col=sc.nextInt();
		
		//3)form Array
		int array[][]=new int[rows][col];
		
		//4)insert the values in the array
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[rows][col]=sc.nextInt();
			}
		}
		
		//5)display the array
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]);
			}
		}
	}
}
		