import java.util.*;

class DayIfelse
{
    public static void main(String[]args)
    {
        int Day;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number Of Week :");
        Day = s.nextInt();

        if (Day == 1)
        {
            System.out.println("Monday");
        }
        else if (Day == 2)
        {
            System.out.println("Tuesday");
        }
        else if (Day == 3)
        {
            System.out.println("Wednesday");
        }
        else if (Day == 4)
        {
            System.out.println("Thursday");
        }
        else if (Day == 5)
        {
            System.out.println("Friday");
        }
        else if (Day == 6)
        {
            System.out.println("Satursday");
        }
        else if (Day == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}