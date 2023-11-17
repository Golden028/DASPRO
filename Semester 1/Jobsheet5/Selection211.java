import java.util.Scanner;
public class Selection211 {
    public static void main(String [] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float finalExam = input11.nextFloat();
        System.out.print("Nilai uts     : ");
        float midExam = input11.nextFloat();
        System.out.print("Nilai kuis    : ");
        float quiz = input11.nextFloat();
        System.out.print("Nilai tugas   : ");
        float assignment = input11.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);

        String message = total < 65 ? "Retake" : "Pass";

        System.out.println("Final Grade = " + total + " and the decission is " + message);

        String predikat = "";
        if (total > 80 && total <= 100) {
            predikat = "A";
        }else if(total > 73 && total <= 80) {
            predikat = "B+";
        }else if(total > 65 && total <= 73) {
            predikat = "B";
        }else if(total > 60 && total <= 65) {
            predikat = "c+";
        }else if(total > 50 && total <= 60) {
            predikat = "c";
        }else if(total > 39 && total <= 50) {
            predikat = "D";
        }else {
            predikat = "E";
        }
        System.out.println("predikat nilai Anda "+predikat);
        input11.close();
    }
}