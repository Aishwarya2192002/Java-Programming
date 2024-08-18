import java.util.*;

class Addtion
{
    public static void main(String[]args)
    {
        int Num1 , Num2 ,Add;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a First Number:");
        Num1 = s.nextInt();
        System.out.println("Enter a Second Number:");
        Num2 = s.nextInt();

        Add = Num1 + Num2 ;
        System.out.println("Addtion is :"+Add);
    }
}