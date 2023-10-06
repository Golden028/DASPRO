import java.util.Scanner;
public class Selection2Exp111 {
    public static void main(String[] args) {
        int year;
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input year = ");
        year = input11.nextInt();

        if(year%4 == 0)
            if(year%100 != 0){
                System.out.println("Leap year");
            }else
                if(year%400 == 0){
                System.out.println("Leap year");
            }else {
                System.out.println("Not a leap year");
        }else {
            System.out.println("Not a leap year"); 
        }
    }
}