/*
 * Nama File : Main.java
 * Deskripsi : Kelas Main untuk menjalankan program
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

/*
* Jawaban Post Test:
* 1. Hasil Output:
*    Program akan mencetak data untuk setiap pegawai (Mira, Joko, Argo).
*    Output spesifik dari tampilData() bergantung pada implementasi di kelas Programmer dan Manajer.
*    Secara umum, outputnya akan seperti:
*    Nama    : Mira, Gaji pokok : 5000000
*    Bonus     : 450000
*    
*    Nama    : Joko, Gaji pokok : 5000000
*    Tunjangan : 700000
*    
*    Nama    : Argo, Gaji pokok : 5000000
*    Tunjangan : 700000
*
* 2. Manfaat Polimorfisme:
*    - Memungkinkan objek dari kelas turunan (Programmer, Manajer) diperlakukan sebagai objek dari kelas induk (Pegawai).
*    - Dalam loop `for (Pegawai emp : emps)`, kita dapat memanggil metode `tampilData()` pada setiap objek `emp` tanpa perlu mengetahui tipe spesifiknya (Programmer atau Manajer). Java secara otomatis akan memanggil implementasi `tampilData()` yang sesuai dengan tipe objek aktual saat runtime (dynamic binding).
*    - Membuat kode lebih fleksibel dan mudah dikembangkan. Jika ada jenis Pegawai baru (misal: Designer), kita hanya perlu membuat kelas baru yang mewarisi Pegawai dan mengimplementasikan `tampilData()`, tanpa perlu mengubah kode di loop `main`.
*
* 3. Permasalahan Tanpa Polimorfisme (Inclusion) saat Menambah pegawai4 dan pegawai5:
*    - Tidak bisa menyimpan objek dari tipe berbeda (misal, Programmer dan Manajer baru) dalam satu collection generik seperti `ArrayList<Pegawai>`.
*    - Perlu membuat collection terpisah untuk setiap tipe Pegawai (misal, `ArrayList<Programmer>`, `ArrayList<Manajer>`).
*    - Untuk memproses semua pegawai (termasuk pegawai4 dan pegawai5), perlu loop terpisah untuk setiap tipe collection atau menggunakan banyak statement `if-else` atau `instanceof` untuk memeriksa tipe setiap objek sebelum memanggil metode yang sesuai (misal, `tampilDataProgrammer()`, `tampilDataManager()`).
*    - Kode menjadi lebih kompleks, sulit dibaca, dan sulit dikelola, terutama jika ada banyak tipe Pegawai. Setiap penambahan tipe Pegawai baru mengharuskan modifikasi signifikan pada kode pemrosesan di `main`.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        // Identitas Diri
        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println(); // ubah code dikit, buat kasih spasi antar record biar makin cakep outputnya
            // boleh lah ya bang hehe
        }

        // System.out.println("Sulhan Fuadi (24060123130115)");
    }
}
