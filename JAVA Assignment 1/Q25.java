class Q25
{
    public static void main (String args [])
    {

    //25.Write a program to convert state of Float instance into byte, short, int, long, float and double.
        float num = 60.5f;

        byte num1 = (byte) num;
        System.out.println("Num2  : "+num1);
                
        short num2= (short)num;
        System.out.println(num2);
        
        int num3= (int)num;
        System.out.println(num3);

        long num4 = (long)num;
        System.out.println(num4);

        float num5= (float)num;
        System.out.println(num5);

        double num6= (double)(num);
        System.out.println(num6);


    }
}