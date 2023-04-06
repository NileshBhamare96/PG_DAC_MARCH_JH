class Q28
{
    public static void main(String args [])
    {
      
         {   double num =150.20d;
            String str = Double.toString(num);
            System.out.println(num);
         }
    
        {
        Double num =150.20d;
         Double num1 = Double.valueOf(num);
        System.out.println(num);
        }
        
        {
            String str = new String("1205");
            Double num =Double.parseDouble(str);
            System.out.println(num);
        }
        //d. flaot value into binary, octal and hexadecimal string.
    }
}