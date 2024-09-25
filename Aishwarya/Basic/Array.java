import java.util.*;
public class Array
 {
    public static void main(String[] args) 
    {
        int[] Number = {10,20,30,40,50};

        System.out.println("\n Array length:" + Number.length +"\n");
        for(int i = 0;i < Number.length;i++)
        {
            System.out.println("\t Element at index" + i + ":"+ Number[i]);
        }
    }
}
