import java.util.Scanner;

public class Apex_Self_Service_Terminal_and_Registration_Kiosk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String text = "cat";
        
        String rightPadded = String.format("%-8s", text);
        
        String leftPadded = String.format("%8s", text);

        
        System.out.println("==============================================");
        System.out.println("       APEX VISITOR CHECK-IN");
        System.out.println("==============================================");
        System.out.println();

        
        System.out.print("Enter Full Name (First & Last): ");
        String fullName = scanner.nextLine();

        
        System.out.print("Enter Department / Organization: ");
        String organization = scanner.nextLine();

        
        System.out.print("Enter Contact Email / Handle: ");
        String contact = scanner.nextLine();

        
        System.out.print("Enter Access Level / Badge Tier: ");
        String accessLevel = scanner.nextLine();

        String issuer = "BCH Software Terminal System";

        
        System.out.println();
        System.out.println("==============================================");
        System.out.println("              APEX ENTERTAINMENT PASS");
        System.out.println("----------------------------------------------");
        System.out.println("|ATTENDEE : " + String.format("%-33s", fullName) + "|");
        System.out.println("|ORG      : " + String.format("%-33s", organization) + "|");
        System.out.println("|CONTACT  : " + String.format("%-33s", contact) + "|");
        System.out.println("|ACCESS   : " + String.format("%-33s", accessLevel) + "|");
        System.out.println("|ISSUER   : " + String.format("%-33s", issuer) + "|");
        System.out.println("==============================================");

        scanner.close();
    }
}