import java.util.Scanner;

public class ExpressingGratitude_11 {
    public static String getGreetRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("input the name of poeple you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetRecipient();
        System.out.println("Thank you "+ name +"for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like I could ask you anything.");
        sayAdditionalGreatings("I appreciate your dedication to teaching!");
    }
    public static void sayAdditionalGreatings(String AdditionalMessage) {
        System.out.println("Additional Greeting: " + AdditionalMessage);
    }
    public static void main(String[] args) {
        sayThankyou();
    }
}
