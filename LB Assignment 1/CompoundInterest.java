import java.lang.Math ;
public class  CompoundInterest
{
    public static void main(String arg[])
    {
        double LoanAmt =  50000000.00 ; 
        double Year = 5 ;
        double RateOfIntrest = 10.75 ;

        long CompoundIntrest = 0 ;
        CompoundIntrest = (int)(LoanAmt * Math.pow(( 1 + (RateOfIntrest / 100 )),Year)) ;
        System.out.println( "The Compound Intrest is: "+(int)CompoundIntrest);

        

    }    
}
