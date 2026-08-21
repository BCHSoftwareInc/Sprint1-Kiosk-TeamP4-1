import java.util.Scanner;

public class Name
{
    public static void main(String args[])
    {
        Scanner inputReader = new Scanner(System.in); 
        String Name;
        System.out.println("What is your name?");
        Name = inputReader.nextLine(); 
        System.out.println("My Name is " + Name);
        inputReader.close(); 
    }
}
