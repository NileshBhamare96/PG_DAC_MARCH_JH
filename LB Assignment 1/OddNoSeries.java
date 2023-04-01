import java.util.*;

class Numbers {
    public void OddDisplay()
    {
        int iCnt = 1 ;
        System.out.println("Odd Numbers From 1 to 20");
        for(iCnt = 1 ; iCnt <= 20 ; iCnt+= 2 )
        {
            System.out.println( iCnt);
        }    
    }
}
public class OddNoSeries
{
    public static void main(String arg[]) {
   
        Numbers nobj = new Numbers();
      
        nobj.OddDisplay();
    }

}


