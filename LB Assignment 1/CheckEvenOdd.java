import java.util.*;

class Numbers {
    public boolean CheckEvenOdd(int iNo) {
        if ((iNo % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}

class CheckEvenOdd {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the Number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        boolean bRet = nobj.CheckEvenOdd(iNo);
        if (bRet == true) {
            System.out.println(iNo + " is a Even Number.");
        } else {
            System.out.println(iNo + " is a Odd Number.");
        }

    }

}