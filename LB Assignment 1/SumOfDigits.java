import java.util.*;

class Digits {
    public int SumDigits(int iNo) {
        int iSum = 0;
        int iDigit = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
}


public class SumOfDigits {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iAns = dobj.SumDigits(iNo);

        System.out.println("Sum of Digits of Number " + iNo + " is " + iAns);

    }

}
