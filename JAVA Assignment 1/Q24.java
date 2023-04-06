class Q24
{
    public static void main(String args [])
    {
      
         {   float num =100.20f;
            String str = Float.toString(num);
            System.out.println(num);
         }
    
        {
        float num =100.20f;
         float num1 = Float.valueOf(num);
        System.out.println(num);
        }
        
        {
            String str = new String("105");
            float num =Float.parseFloat(str);
            System.out.println(num);
        }
        //d. float value into hexadecimal string.
        {

            float num = 40.05f;
            String str = Float.toHexString(num);
            System.out.println(str);
        }
    }
}