import java.util.*;
public class PrintDigits 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();
        int Digit ;
       
        while(iNo != 0)
        {
            Digit = iNo % 10 ;  
            System.out.print(Digit+" ");
            iNo = iNo / 10 ;
        }
    }   
}
