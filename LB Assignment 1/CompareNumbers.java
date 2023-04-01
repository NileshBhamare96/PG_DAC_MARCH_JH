import java.util.*;

public class CompareNumbers
{
     public static void main(String arg[])

    {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number");
        int iNo2 = sobj.nextInt();
        
        int iAns = iNo1 > iNo2 ? iNo1 +iNo2 : iNo1 - iNo2 ;

        System.out.println(iAns);

    }
}
