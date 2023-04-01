// A 
// A B
// A B C
// A B C D
// A B C D E
public class Pattern_2
{
    public static void main(String args[])
    {

        for(char c = 'A' ; c <= 'E' ; c++)
        {
            for(char ch = 'A' ; ch <= c ; ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

