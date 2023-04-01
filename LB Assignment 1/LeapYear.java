import java.util.*;

public class LeapYear
{
     public static void main(String arg[])

    {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Year");
        int Year = sobj.nextInt();
            
        String S = (Year % 4 ) == 0  ? "It is Leap Year" : "It is Not Leap Year" ;

        System.out.println(S);

    }
}
