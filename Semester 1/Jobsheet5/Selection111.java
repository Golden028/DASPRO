import java.util.Scanner;
public class Selection111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        //System.out.print("Input a number");
        //int number = input11.nextInt();

        //if(number%2 == 0){
            //System.out.println(number+" is an even number!");
        //}else{
            //System.out.println(number+" is an odd number!");
        //}

        System.out.print("Input a number = ");
        int number = input11.nextInt();
        String output = (number%2 == 0) ? number+" is an even number!" : number+" is an odd number!";
        System.out.println(output);
        }
    }