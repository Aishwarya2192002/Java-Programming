import java.util.*;

class Calculator
{
    public static void main (String[]args)
    {
        char Operator;
        int Num1 , Num2 , Result ;

        Scanner s = new Scanner(System.in);
        System.out.println("Choose an Operator : + , - , * , /");
        Operator = s.next().charAt(0);
        System.out.println("Enter First Number :");
        Num1 = s.nextInt();
        System.out.println("Enter Second Number :");
        Num2 = s.nextInt();

        switch(Operator)
        {
            case '+':
                Result = Num1 + Num2 ;
                System.out.println("Addtion is :"+Result);
                break;

            case '-':
                Result = Num1 - Num2 ;
                System.out.println("Subtraction is :"+Result);
                break;

            case '*':
                Result = Num1 * Num2 ;
                System.out.println("Multiplication is :"+Result);
                break;

            case '/':
                Result = Num1 / Num2 ;
                System.out.println("Division is :"+Result);
                break;

            default:
                System.out.println("Invalid Choice Operator");
                break; 
        }

    }
}