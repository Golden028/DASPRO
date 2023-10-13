import java.util.Scanner;
public class WhileMultiples11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int multiple, sum=0, counter=0;

        System.out.print("Input the multiple = ");
        multiple = input11.nextInt();
        int i=1;

        while(i<=50){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
                //System.out.println(i+"-");
            } 
            i++;
        }
        System.out.printf("there are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple,sum);
    }
}
