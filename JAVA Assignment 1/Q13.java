class Q13
{
    public static void main(String args [])
    {
        //short value into String
        {
            short num =25;
            String str = Short.toString(num);
            System.out.println(str);
        }
     //short value into Short instance.
        {
            short num =25;
            short num2 = Short.valueOf(num);
            System.out.println(num2);
        }
      //  String instance into Short instance.

        {
            String str = new String ("45");
            short num= Short.parseShort(str);
            System.out.println(num);
        }
    }
}