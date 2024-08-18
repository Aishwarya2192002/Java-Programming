import java.util.*;

class Table
{
    public static void main(String[]args)
    {
       int Num  , i = 1;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a Number :");
       Num = s.nextInt();
       
       while (i <= 10)
       {
           System.out.println(Num + "*" +i+ "=" +Num * i);
           i++;
       }

       

    }  
}  