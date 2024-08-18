import java.util.*;

class MaximumTwo
{
    public static void main(String[]args)
    {
        int Num1 , Num2 ;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a First Number:");
        Num1 = s.nextInt();
        System.out.println("Enter a Second Number:");
        Num2 = s.nextInt();

        if(Num1 > Num2)
        {
            System.out.println("Maximum Number Is:" +Num1 );
        }
        else 
        {
            System.out.println("Maximum Number Is:" +Num2 );
        }
    }
}