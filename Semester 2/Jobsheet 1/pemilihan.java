import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;

        if (!(0 <= tugas && tugas <= 100) || !(0 <= kuis && kuis <= 100) || !(0 <= uts && uts <= 100) || !(0 <= uas && uas <= 100)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}