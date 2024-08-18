import java.util.*;

class MaximumThree
{
    public static void main(String[]args)
    {
        int Num1 , Num2 ,Num3 ;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a First Number:");
        Num1 = s.nextInt();
        System.out.println("Enter a Second Number:");
        Num2 = s.nextInt();
        System.out.println("Enter a Third Number:");
        Num3 = s.nextInt();

        if(Num1 >= Num2 && Num1 >= Num3)
        {
            System.out.println("Maximum Number Is:" +Num1 );
        }
        else if(Num2 >= Num1 && Num2 >= Num3)
        {
            System.out.println("Maximum Number Is:" +Num2 );
        }
        else 
        {
            System.out.println("Maximum Number Is :"+Num3);
        }
    }
}