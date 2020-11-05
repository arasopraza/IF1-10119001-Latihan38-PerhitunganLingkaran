import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program Menghitung Lingkaran
 * berbasis OOP
 *
 */

public class PerhitunganLingkaran {
    public int diameter,
            jariLingkaran,
            luasLingkaran,
            kelilingLingkaran;
    public double phi;

    public void validasiDiameter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=====Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            try {
                diameter = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
    }

    public void menghitungLuas() {
        phi = Math.PI;
        jariLingkaran = diameter / 2;
        luasLingkaran = (int) (phi * (jariLingkaran * jariLingkaran));
    }

    public void menghitungKeliling() {
        kelilingLingkaran = (int) (phi * 2 * jariLingkaran);
    }

    public static void main(String[] args) {
        PerhitunganLingkaran lingkaran = new PerhitunganLingkaran();
        lingkaran.validasiDiameter();
        lingkaran.menghitungLuas();
        lingkaran.menghitungKeliling();

        System.out.print("\n");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + lingkaran.jariLingkaran + " cm");
        System.out.println("Luas Lingkaran = " + lingkaran.luasLingkaran + " cm");
        System.out.println("Keliling Lingkaran = " + lingkaran.kelilingLingkaran + " cm");
    }
}
