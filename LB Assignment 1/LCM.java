import java.util.*;

class Numbers {
    public int CheckLCM(int iNo1, int iNo2)
    {
        int LCM = (iNo1 > iNo2) ? iNo1 : iNo2 ;

        int iCnt = 0 ;

        for(iCnt = LCM ; iCnt <= (iNo1*iNo2) ; iCnt+=LCM )
        {
            if(iCnt % iNo1 == 0 && iCnt % iNo2 == 0)
            {
                break;
            }
        }
        return iCnt ;     
    }
}
public class LCM 
{
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        Numbers nobj = new Numbers();

        System.out.println("Enter the First Number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number");
        int iNo2 = sobj.nextInt();

        int LCM = nobj.CheckLCM(iNo1, iNo2);

        System.out.println("LCM of "+iNo1+ " and " +iNo2+ " is : " +LCM);

    }

}
