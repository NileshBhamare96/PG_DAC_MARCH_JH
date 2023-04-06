class Q20
{
    public static void main(String args [])
    {
       // a. long value into String
         {   long num =100;
            String str = Long.toString(num);
            System.out.println(num);
         }
        //b. long value into Long instance.
        {
        long num =100;
         long num1 = Long.valueOf(num);
        System.out.println(num);
        }
        //c. String instance into Long instance.
        {
            String str = new String("105");
            long num =Long.parseLong(str);
            System.out.println(num);
        }
        //d. long value into binary, octal and hexadecimal string.

        {
            long num =10;
  
            String str1 = Long.toBinaryString(num);
            System.out.println(str1);
  
            String str2 = Long.toHexString(num);
            System.out.println(str2);
  
            String str3 = Long.toOctalString(num);
            System.out.println(str3);
  
  
  
          }
    }
}
