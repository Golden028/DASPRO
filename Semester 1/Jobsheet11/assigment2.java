import java.util.Scanner;
public class assigment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (at least 5) = ");
        int N = sc.nextInt();

        while (N < 5) {
            System.out.println("The value of N must be at least 3, Please re-enter");
            System.out.print("Enter the value of N (at least 5) = ");
            N = sc.nextInt();
        }

        for (int i=N;i>=1;i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
