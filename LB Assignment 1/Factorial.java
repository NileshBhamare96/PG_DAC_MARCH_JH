import java.util.*;

class Numbers {
    public int Factorial(int iNo) {
        int iCnt = 0;
        int iFact = 1;
        for (iCnt = 1; iCnt <= iNo ; iCnt++) 
        {
            iFact = iFact * iCnt;

        }
        return iFact;

    }

}

class Factorial {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the Number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iAns = nobj.Factorial(iNo);

        System.out.println("Factorial of " + iNo + " is " + iAns);

    }

}