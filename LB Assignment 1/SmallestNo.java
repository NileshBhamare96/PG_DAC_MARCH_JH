import java.util.*;

class Numbers
{
    int iSmall = 0 ;
    public int CheckSmall(int iNo1 , int iNo2 , int iNo3)
    {
        if((iNo1 <= iNo2) && (iNo1 <= iNo3))
        {
            iSmall = iNo1 ;
        }
        else if((iNo2 <= iNo1) && (iNo2 <= iNo3))
        {
            iSmall = iNo2 ;
        }
        else
        {
            iSmall = iNo3 ;
        }

        return iSmall ;
            
    }
}

public class SmallestNo 
{
    public static void main(String arg[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        int iNo2 = sobj.nextInt();

        System.out.println("Enter Third Number");
        int iNo3 = sobj.nextInt();

        int iAns =  nobj.CheckSmall( iNo1 ,iNo2 , iNo3);

        System.out.println("Smallest Number is : " +iAns);

    }
    
}
