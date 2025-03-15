/* Nama File : Main.java
 * Deskripsi : Kelas Main merupakan kelas utama yang digunakan untuk menjalankan program
 *             dan menguji implementasi hierarchy class Pegawai
 * Pembuat   : Sulhan Fuadi (24060123130115)
 * Tanggal   : 13 Maret 2025
 */

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
                System.out.println("======================================================");
                System.out.println("     SISTEM INFORMASI KEPEGAWAIAN UNIVERSITAS");
                System.out.println("======================================================");
                System.out.println();

                // Membuat objek DosenTetap
                System.out.println(">> Membuat data Dosen Tetap...");
                DosenTetap dosenTetap = new DosenTetap(
                                "198009142006041002", // NIP
                                "Edy Suharto, S.T., M.Kom", // Nama
                                LocalDate.of(1990, 5, 5), // Tanggal Lahir
                                LocalDate.of(2015, 1, 1), // TMT (Tanggal Mulai Tugas)
                                10000000, // Gaji Pokok
                                "Fakultas Sains dan Matematika", // Fakultas
                                "0014098003" // NIDN
                );

                // Membuat objek DosenTamu
                System.out.println(">> Membuat data Dosen Tamu...");
                DosenTamu dosenTamu = new DosenTamu(
                                "199805212024061001", // NIP
                                "Satriawan Rasyid Purnama, S.Kom., M.Cs.", // Nama
                                LocalDate.of(1985, 8, 15), // Tanggal Lahir
                                LocalDate.of(2020, 3, 1), // TMT
                                4500000, // Gaji Pokok
                                "Fakultas Sains dan Matematika", // Fakultas
                                "0014098012", // NIDK
                                LocalDate.of(2026, 12, 31) // Tanggal Berakhir Kontrak
                );

                // Membuat objek Tendik
                System.out.println(">> Membuat data Tenaga Kependidikan...");
                Tendik tendik = new Tendik(
                                "H.7.198611152023101001", // NIP
                                "Beny Nugroho, S.Kom.", // Nama
                                LocalDate.of(1995, 11, 10), // Tanggal Lahir
                                LocalDate.of(2018, 7, 1), // TMT
                                3500000, // Gaji Pokok
                                "Akademik" // Bidang
                );

                System.out.println("\nData berhasil dibuat!");
                System.out.println("\n======================================================");

                // Menampilkan informasi untuk setiap pegawai
                System.out.println("\n===== INFORMASI DOSEN TETAP =====");
                dosenTetap.printInfo();

                System.out.println("\n===== INFORMASI DOSEN TAMU =====");
                dosenTamu.printInfo();

                System.out.println("\n===== INFORMASI TENAGA KEPENDIDIKAN =====");
                tendik.printInfo();

                System.out.println("\n======================================================");
                System.out.println("              PROGRAM SELESAI");
                System.out.println("======================================================");
        }
}
