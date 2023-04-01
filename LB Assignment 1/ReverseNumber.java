import java.util.*;

class Digits {
    public void Reverse(int iNo) {
        int iRev = 0;
        int iDigit = 0;
        int iTemp = iNo ;
         
        while (iTemp != 0) {
            iDigit = iTemp % 10;
            iRev = (iRev * 10) + iDigit ;
            iTemp = iTemp / 10;
        }

        System.out.println("Reverse of Number "+iNo+ " is : "+iRev);

    }
}

public class ReverseNumber {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        dobj.Reverse(iNo);

    }
}


