import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N = ");
        int N = sc.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
        System.out.println();
        }
        sc.close();
    }
}
