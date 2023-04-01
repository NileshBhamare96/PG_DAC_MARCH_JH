import java.util.Scanner;

public class MaxMinValue
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number");
        int iNo2 = sobj.nextInt();
        System.out.println("Enter Third Number");
        int iNo3 = sobj.nextInt(); 

        System.out.println("To find Maximum Value then Press 1");
        System.out.println("To find Minimum Value then Press 2");

        int Option = sobj.nextInt();

        switch(Option)
        {
            case 1 : if(iNo1 > iNo2 && iNo1 > iNo3)
            {
                System.out.println("Maximum Value is : " +iNo1);
               
            }
            else if(iNo2 > iNo1 && iNo2 > iNo3)
            {
                System.out.println("Maximum Value is : " +iNo2);
               
            }
            else
            {
                System.out.println("Maximum Value is : " +iNo3);
            }
            break;

            case 2 : if(iNo1 < iNo2 && iNo1 < iNo3) 
            {
                System.out.println("Minimum Value is : " +iNo1);
               
            }
            else if(iNo2 < iNo1 && iNo2 < iNo3)
            {
                System.out.println("Minimum Value is : " +iNo2);
               
            }
            else
            {
                System.out.println("Minimum  Value is : " +iNo3);
            } 
            break ;

            default : System.out.println("Please Enter Valid Choice !!!");
        }
    }
}