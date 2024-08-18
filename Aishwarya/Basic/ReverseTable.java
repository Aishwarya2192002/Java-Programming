import java.util.*;

class ReverseTable
{
    public static void main(String[]args)
    {
        int Num1 , Num2 , Num3;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Starting Number :");
        Num1 = s.nextInt();
        System.out.println("Enter The Ending Number :");
        Num2 = s.nextInt();
        System.out.println("Enter The Table Number :");
        Num3 = s.nextInt();

        while(Num1 >= Num2)
        {
            System.out.println(Num1 + "*" +Num3+ "=" +(Num1 * Num3));
            Num1--;
        }
    }
}