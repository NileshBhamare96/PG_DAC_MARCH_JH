class Q8
{
    public static void main(String args[])
    {

    //byte value into Byte instance.
    {
        
        byte num =10;
        byte num1=Byte.valueOf(num);
        System.out.println(num1);
    }
    //String instance into Byte instance.
    {
        String str = new String ("12");
        byte num = Byte.parseByte(str);
        System.out.println(num);
    }
    //byte value into String
    {
        byte num =10;
        String str = Byte.toString(num);
        System.out.println(num);
    }

        
    


    }
}