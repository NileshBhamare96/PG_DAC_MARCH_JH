import java.util.*;

class Digits {
    public boolean CheckPalindrome(int iNo) {
        
        int iRev = 0;
        int iDigit = 0 ;
        int iTemp = iNo ;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
    
        while (iTemp  != 0) {
            iDigit = iTemp  % 10;
            iRev = (iRev * 10) + iDigit ;
            iTemp  = iTemp  / 10;
        }

        if(iRev == iNo)
        {
            return true ;
        }
        else
        {
            return false ;
        }

    }
}

public class Palindrome {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        boolean bRet = dobj.CheckPalindrome(iNo);


        if(bRet == true)
        {
           System.out.println(iNo+ " is a Palindrome Number ");
        }
        else
        {
            System.out.println(iNo+ " is Not Palindrome Number ");
        }

    }
}



