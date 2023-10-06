import java.util.Scanner;
public class Selection2Exp211 {
    public static void main(String[] args) {
        int angle=0, totalAngle=0, angle1=0, angle2=0, angle3=0;
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input angle 1 = ");
        angle1 = input11.nextInt();
        System.out.print("Input angle 2 = ");
        angle2 = input11.nextInt();
        System.out.print("Input angle 3 = ");
        angle3 = input11.nextInt();
        totalAngle = angle1+angle2+angle3;

        //if(totalAngle == 180)
            //if(angle1==90 || angle2==90 || angle3==90)
                //System.out.println("Right triangle");
            //else
                //System.out.println("Not a right trianle");
        //else
            //System.out.println("Not a triangle");

        if(totalAngle == 180)
        if(angle1==90 || angle2==90 || angle3==90)
            System.out.println("Right triangle");
            else if (angle1 == angle2 && angle2 == angle3){
                System.out.println("Right This is an equilateral triangle");
                }else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3){
                System.out.println("This is an isosceles triangle");
                }else{
                System.out.println("not a triangle");
                }

    }
}
