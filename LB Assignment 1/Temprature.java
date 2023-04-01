import java.util.* ;

public class Temprature 
{
    public static void main(String arg[])
    {
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("If you want to convet Fahrenheit to Celcius then Press 1");
        System.out.println("If you want to convet Celcius to Fahrenheit then Press 2");

        int Option = sobj.nextInt();

        switch(Option)
        {
            case 1 : 
            System.out.println("Enter Temprature in Fahrenheit");
            float  F = sobj.nextFloat();
            float Fahrenheit = (F -32) * 5/9;
            System.out.println("Conversion of " +F+ " Fahrenheit to Celcius is : " +Fahrenheit+ "^C");
            break;

            case 2 : 
            System.out.println("Enter Temprature in Celcius");
            float  C = sobj.nextFloat();
            float Celcius = (C * 9/5) +32 ;
            System.out.println("Conversion of " +C+ " Celcius to Fahrenheit  is : " +Celcius+ "F");
            break;

            default: System.out.println("Plz Enter valid Choice!!");
        }


    }
    
}
