class Min_max
{
	public static void main(String args[])
	{
		//1.initialisation of array elements
		int arr[]={30,40,20,60,8};
		
		//2.display the array elements
		for(int i:arr)
		{
			System.out.print(" "+i);
		}

		//3.find the min value in array elements
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		System.out.println("\nminimum value is:"+min);
		System.out.println("\nmaximum value is:"+max);
	}
}
		
				
				