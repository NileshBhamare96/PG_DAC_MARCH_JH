import java.util.*;

class Numbers {
    public void EvenDisplay()
    {
        int iCnt = 2 ;
        System.out.println("Even Number Series from 1 to 20");
        for(iCnt = 2 ; iCnt <= 20 ; iCnt+= 2 )
        {
            System.out.println( iCnt);
        }    
    }
}
public class Program19
{
    public static void main(String arg[]) {
   
        Numbers nobj = new Numbers();
      
        nobj.EvenDisplay();
    }

}

