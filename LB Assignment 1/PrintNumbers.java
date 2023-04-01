import java.util.*;

class Numbers {
    public void Display(int iNo) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

    }

}

class PrintNumbers {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        int iNo = 1;

        Numbers nobj = new Numbers();

        nobj.Display(iNo);

    }

}