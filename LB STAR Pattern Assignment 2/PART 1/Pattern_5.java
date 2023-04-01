// A 
// B B 
// C C C
// D D D D
// E E E E E

public class Pattern_5
{
    public static void main(String args[])
    {

        for(char c = 'A' ; c <= 'E' ; c++)
        {
            for(char ch = 'A' ; ch <= c ; ch++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

