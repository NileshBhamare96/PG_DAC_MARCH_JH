class Q6
{
    public static void main(String [] args)
   {
    //String value into Boolean instance.
    {   String str = new String("false");
        boolean num = Boolean.valueOf(str);
        System.out.println(num);
    }
     // boolean value into Boolean instance.
    {
        boolean num = false;
        boolean num1 = Boolean.valueOf(num);
        System.out.println(num1);
    }
     //  String value into boolean value
    {
        String str = new String ("ture");
        boolean num =Boolean.parseBoolean(str);
        System.out.println(str);
    }
    //  boolean value into String
    {
        boolean num = false;
        String str =Boolean.toString(num);
        System.out.println(str);
    }
   
    

    }
}