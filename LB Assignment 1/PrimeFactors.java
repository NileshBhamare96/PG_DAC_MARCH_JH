import java.util.*;

public class PrimeFactors
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);    
        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        for(int div = 2 ; div < iNo ; div++)
        {
            while( (iNo % div) == 0)
            {
                iNo = iNo / div ;
                System.out.println(div);
            }
    
        }

        if(iNo != 1)
        {
            System.out.println(iNo); 
        }
        
    }
}
