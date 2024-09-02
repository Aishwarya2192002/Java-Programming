import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        
        String studentName , course ,city;
        int rollNumber;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = s.nextLine();
        
        System.out.print("Enter Roll Number: ");
        rollNumber = s.nextInt();
        
        System.out.print("Enter Course: ");
        course = s.nextLine();
        
        System.out.print("Enter City: ");
        city = s.nextLine();
        
        
        
        
    
        System.out.println("Student Name: " + studentName + ", Roll Number: " + rollNumber + ", Course: " + course + ", City: " + city);
    }
}
