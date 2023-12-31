import java.util.Scanner;

public class DoWhileLeaveEntitlement11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Number of Leave Entitlement = ");
        leaveEntitlement = input11.nextInt();

        do {
            System.out.print("Do you want to take a leave? (y/n) = ");
            confirmation = input11.next();

            if(confirmation.equalsIgnoreCase("y")){
                System.out.print("Leave number = ");
                numLeave = input11.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("The remaining leave entitlement = " + leaveEntitlement);
                } else {
                    System.out.println("The remaining leave entitlement is not sufficient!");
                    break;
                }
            }
        } while (leaveEntitlement > 0);
        input11.close();
    }
}
