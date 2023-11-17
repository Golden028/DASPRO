import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
            } while(!success);
            System.out.print("Do you want to repeat the game (Y/N)?");
            menu = input.nextLine().charAt(0);
            input.nextLine();
        } while(menu=='Y' || menu=='y');
    }
    
}
