import java.util.*;

class Numbers {
    public int CheckGCD(int iNo1, int iNo2)
    {
        int iRem = 0 ;

       while(iNo1 % iNo2 != 0)
       {
        iRem = iNo1 % iNo2 ;
        iNo1 = iNo2 ;
        iNo2 = iRem ;
       }

       return iNo2 ;      
    }
}
public class GCD 
{
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        Numbers nobj = new Numbers();

        System.out.println("Enter the First Number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number");
        int iNo2 = sobj.nextInt();

        int GCD = nobj.CheckGCD(iNo1, iNo2);

        System.out.println("GCD of "+iNo1+ " and " +iNo2+ " is : " +GCD);

    }

}

