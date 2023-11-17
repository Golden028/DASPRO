import java.util.Scanner;

public class assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value N (at least 3) = ");
        int N = sc.nextInt();

        while (N < 3) {
            System.out.println("Enter the value of N must be at least 3, please re-enter");
            System.out.print("Enter the value of N (at least 3) = ");
            N = sc.nextInt();            
        }

        for (int h = 1; h <= N; h++) {
            for (int i = N - h; i > 0; i--){
                System.out.print(" ");
            }
            for (int j = 1; j <= h; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
