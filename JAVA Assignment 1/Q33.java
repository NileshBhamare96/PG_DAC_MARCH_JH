import java.util.*;
class Test{
    static int i1,i2;
    static float f1,f2;
    static double d1,d2;

   

}
class Q33
{
    
    public static void main(String[] args) 
    {
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner (System.in);
        int choice = 0;

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int a = Integer.parseInt(args[0]);
        if(a==1)        
        {
            Test.i1 = Integer.parseInt(args[1]);
            Test.i2 = Integer.parseInt(args[2]);
            choice = sc.nextInt();
        }  
        else
        {
            if(a==2)
            {
            Test.f1 = Float.parseFloat(args[1]);
            Test.f2 = Float.parseFloat(args[2]);
            choice = sc.nextInt();
            }
            if(a==3)
            {
            Test.d1 = Double.parseDouble(args[1]);
            Test.d2 = Double.parseDouble(args[2]);
            choice = sc.nextInt();
            }
        }
        if(a==1){
        switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            int result =Test.i1+Test.i2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            int Substraction = Test.i1 - Test.i2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            int Multiplication = Test.i1 * Test.i1 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            int Division = Test.i1 / Test.i2 ;
            System.out.println(Division);
            break;
        }
    }
        if(a==2){
        switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            float result =Test.f1+Test.f2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            float Substraction = Test.f1 - Test.f2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            float Multiplication = Test.f1 * Test.f2 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            float Division = Test.f1 / Test.f2 ;
            System.out.println(Division);
            break;
        }
    }
         if(a==3){
          switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            double result =Test.d1+Test.d2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            double Substraction = Test.d1 - Test.d2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            double Multiplication = Test.d1 * Test.d2 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            double Division = Test.d1 / Test.d2 ;
            System.out.println(Division);
            break;
        }
    }
         
        
        
        
    }   
    

}