import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nama;
        String nilai_index;

        final double nilai_quiz, nilai_absen, nilai_akhir;
        Scanner input = new Scanner (System.in);

        System.out.println("===== Menghitung Nilai Mahasiswa =====\n");

        System.out.print("Masukan nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan nilai quiz : ");
        nilai_quiz = input.nextInt();

        System.out.print("Masukkan nilai absensi : ");
        nilai_absen = input.nextInt();

        nilai_akhir = (0.60 * nilai_quiz + 0.40 * nilai_absen);

        if (nilai_akhir >= 80) {
            nilai_index = "a";
        } else if (nilai_akhir >= 70 && nilai_akhir < 80) {
            nilai_index = "b";
        } else if (nilai_akhir >= 50 && nilai_akhir < 70) {
            nilai_index = "c";
        } else if (nilai_akhir >=30 && nilai_akhir < 50) {
            nilai_index = "d";
        } else {
            nilai_index = "e";
        }

        System.out.println("===== Hasil =====\n");
        System.out.println(nama +" memiliki nilai akhir = "+ nilai_akhir +" dan nilai indeks = " + nilai_index);

    }
}
