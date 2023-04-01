import java.util.*;

public class FactorialRecursion 
{
    static int iFact = 1;
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        FactorialRecursion obj = new FactorialRecursion();
        

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        obj.Calfactorial(iNo);
        System.out.println("Factorial of " + iNo + " is " +iFact);
      
    }

    public void Calfactorial(int iNo) {
        
        int iTemp = iNo ;

        if(iTemp >= 1)
        {
            iFact = iFact * iTemp;
            Calfactorial(iTemp - 1);
        }
      
    }
}