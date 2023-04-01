import java.util.*;

class Numbers
{
    public void FactorsDisplay(int iNo)
    {
        int iCnt = 0;

        System.out.println("factors of "+iNo+ ": "); 

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
               System.out.println(+iCnt); 
            }
        }

    }
}

class PrintFactors
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.FactorsDisplay(iNo);
    }
}