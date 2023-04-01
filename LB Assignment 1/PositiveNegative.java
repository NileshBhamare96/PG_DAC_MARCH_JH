import java.util.*;

class Numbers {
    public boolean CheckPositiveNegative(int iNo) 
    {
        if (iNo < 0) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

}

class PositiveNegative {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the Number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        boolean bRet = nobj.CheckPositiveNegative(iNo);
        if (bRet == true) {
            System.out.println(iNo + " is a Negative Number.");
        } else {
            System.out.println(iNo + " is a Positive Number.");
        }

    }

}