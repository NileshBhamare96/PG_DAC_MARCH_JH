class Q16
{
    public static void main( String args [])
    {
       // int value into String
       {
        
        int num =45;
        String str = Integer.toString(num);
        System.out.println(str);

       }
        //int value into Integer instance.
       {
         int num =54;
         int num1=Integer.valueOf(num);
         System.out.println(num1);
       }

        // String instance into Integer instance.

        {   String str = new String("145");
            int num =Integer.parseInt(str);
            System.out.println(num);
         }
        
        //int value into binary, octal and hexadecimal string.

        {
          int num =10;

          String str1 = Integer.toBinaryString(num);
          System.out.println(str1);

          String str2 = Integer.toHexString(num);
          System.out.println(str2);

          String str3 = Integer.toOctalString(num);
          System.out.println(str3);



        }
        
    }
}