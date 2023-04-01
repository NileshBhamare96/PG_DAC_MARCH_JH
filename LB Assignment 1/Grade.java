import java.util.*;
public class Grade
{
    public static void main(String args[])
    {  
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Total Marks out of 800"); 

        int iMarks = sobj.nextInt();
        int iTotal = 800 ;
        float fPercent = 0.0F ;

        if(iMarks < 0 || iMarks > 800)
        {
            System.out.println("Please Enter Valid Total Marks");  
        }
        else
        {
            fPercent = iMarks * 100 / (float)iTotal;
            System.out.println("Percentage : " +fPercent+ " %");

           if(fPercent > 95)
           {
            System.out.println("Grade : Distinction");  
           }
           else if(fPercent >= 85)
           {
            System.out.println("Grade : First Division");  
           }
           else if(fPercent >= 75)
           {
            System.out.println("Grade : Second Division");  
           }
           else if(fPercent < 75)
           {
            System.out.println("Grade : Average");  
           }

        }
  
    }
    
}
