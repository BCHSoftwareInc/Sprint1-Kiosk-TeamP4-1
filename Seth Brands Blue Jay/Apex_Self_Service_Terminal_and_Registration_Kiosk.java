import java.util.Scanner;

public class Apex_Self_Service_Terminal_and_Registration_Kiosk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Header
        System.out.println("==============================================");
        System.out.println("       APEX VISITOR CHECK-IN");
        System.out.println("==============================================");
        System.out.println();

        // 1. Full Name
        System.out.print("Enter Full Name (First & Last): ");
        String fullName = scanner.nextLine();

        // 2. Department / Organization
        System.out.print("Enter Department / Organization: ");
        String organization = scanner.nextLine();

        // 3. Contact Email / Handle
        System.out.print("Enter Contact Email / Handle: ");
        String contact = scanner.nextLine();

        // 4. Access Level / Badge Tier
        System.out.print("Enter Access Level / Badge Tier: ");
        String accessLevel = scanner.nextLine();

        String issuer = "BCH Software Terminal System";

        // Formatted ASCII Badge Output
        System.out.println();
        System.out.println("==============================================");
        System.out.println("              APEX ENTERTAINMENT PASS");
        System.out.println("----------------------------------------------");
        System.out.println("ATTENDEE : " + fullName);
        System.out.println("ORG      : " + organization);
        System.out.println("CONTACT  : " + contact);
        System.out.println("ACCESS   : " + accessLevel);
        System.out.println("ISSUER   : " + issuer);
        System.out.println("==============================================");

        scanner.close();
    }
}