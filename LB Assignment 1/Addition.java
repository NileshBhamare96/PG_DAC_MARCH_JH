
import java.util.*;

class Numbers
{
    public int Addition(int iNo1 , int iNo2)
    {
      int iCnt = 0 ;
      int iSum = 0 ;
      for(iCnt = 0 ; iCnt <= iNo2 ; iCnt++)
      {
        iSum = iNo1++ ;
      }

      return iSum;
    }    
}

public class Addition {
    public static void main(String arg[]) {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter First Number");
        int iNo2 = sobj.nextInt();

        int iSum = nobj.Addition(iNo1, iNo2);

        System.out.println("Addition of Numbers is : " + iSum);
    }

}
