import java.util.*;

class EvenOdd
{
    public static void main(String[]args)
    {
        int Num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        Num = s. nextInt();

        if(Num % 2 ==0)
        {
            System.out.println("This is Even Number");
        }
        else
        {
            System.out.println("This is Odd Number");
        }
    }
}