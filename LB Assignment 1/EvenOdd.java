import java.util.* ;
public class EvenOdd
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        String S = ((iNo % 2 ) == 0 )? "It is Even Number." : "It is Odd Number." ; 

        System.out.println(S);
         
    }
}