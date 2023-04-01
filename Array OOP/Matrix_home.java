class Matrix_home
{
	public static void main(String args[])
	{
		int a[][]={{10,20,30},{30,50,10},{40,3,2}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int add[][]=new int[3][3];
		int mul[][]=new int[3][3];
		//1.addition of two matrix 
		System.out.println("First Array elements is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+a[i][j]+" ");
			}
			System.out.println();
		} 
		System.out.println("Second Array Elements is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+b[i][j]+" ");
			}
			System.out.println();
		} 
		System.out.println("--------------------------------------------");
		System.out.println("Addition of two matrix is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+add[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("Multiplication of two matrix");
		//2.multiplication of two matrix
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j]=a[i][j]*b[i][j];
			}
			
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+add[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//3.Substraction of two matrix
		System.out.println("--------------------------------------------");
		System.out.println("Substraction of two matrix");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j]=a[i][j]-b[i][j];
			}
			
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+add[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}