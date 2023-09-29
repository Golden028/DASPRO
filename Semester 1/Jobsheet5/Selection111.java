import java.util.Scanner;
public class Selection111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Input a number = ");
        int number = input11.nextInt();
        String output = (number%2 == 0) ? number+" Is an even number!" : number+" Is an odd number!";
        System.out.println(output);


        }
    }