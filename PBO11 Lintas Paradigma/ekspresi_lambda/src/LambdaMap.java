import java.util.HashMap;
import java.util.Map;

/*
 * Nama File : LambdaMap.java
 * Deskripsi : Contoh penggunaan ekspresi lambda dengan dan tanpa blok statement
 *             untuk menampilkan dan memproses data mahasiswa menggunakan Map.
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 04 Juni 2025
 */

public class LambdaMap {
  public static void main(String[] args) {
    // Membuat map untuk menyimpan NIM dan nama mahasiswa
    Map<String, String> mahasiswaMap = new HashMap<>();

    // Menambahkan data mahasiswa (NIM, nama)
    mahasiswaMap.put("24060123130001", "Adi");
    mahasiswaMap.put("24060123130002", "Bambang");
    mahasiswaMap.put("24060123130003", "Cici");
    mahasiswaMap.put("24060123130033", "Didi");

    // lambda ekspresi saja
    System.out.println("=== lambda biasa brok ===");
    mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));

    // lambda dengan block statement
    System.out.println("\n=== lambda w/ block statement ===");
    mahasiswaMap.forEach((nim, nama) -> {
      String output = "Mahasiswa: " + nama;
      String nimInfo = "Nomor Induk: " + nim;
      System.out.println(output);
      System.out.println(nimInfo);
      System.out.println("--------------------");
    });

    // sedikit improvisasi
    // filter berdasar nim
    System.out.println("\n=== lambda: u/ filter data ===");
    System.out.println("Mahasiswa dengan NIM berakhiran '3':");
    mahasiswaMap.forEach((nim, nama) -> {
      if (nim.endsWith("3")) {
        System.out.println("Ditemukan: " + nama + " (NIM: " + nim + ")");
      }
    });

    // hitung char nama
    System.out.println("\n=== lambda: u/ kalkulasi ===");
    final int[] totalKarakter = { 0 }; // buat ngitung total

    mahasiswaMap.forEach((nim, nama) -> {
      int panjangNama = nama.length();
      totalKarakter[0] += panjangNama;
      System.out.println("Nama: " + nama + " memiliki " + panjangNama + " karakter");
    });

    System.out.println("Total karakter semua nama: " + totalKarakter[0]);
  }
}

/*
 * Compile dan jalankan kode tersebut!
 * 
 * Output:
 * === lambda biasa brok ===
 * NIM: 24060123130001, Nama: Adi
 * NIM: 24060123130033, Nama: Didi
 * NIM: 24060123130003, Nama: Cici
 * NIM: 24060123130002, Nama: Bambang
 * 
 * === lambda w/ block statement ===
 * Mahasiswa: Adi
 * Nomor Induk: 24060123130001
 * --------------------
 * Mahasiswa: Didi
 * Nomor Induk: 24060123130033
 * --------------------
 * Mahasiswa: Cici
 * Nomor Induk: 24060123130003
 * --------------------
 * Mahasiswa: Bambang
 * Nomor Induk: 24060123130002
 * --------------------
 * 
 * === lambda: u/ filter data ===
 * Mahasiswa dengan NIM berakhiran '3':
 * Ditemukan: Didi (NIM: 24060123130033)
 * Ditemukan: Cici (NIM: 24060123130003)
 * 
 * === lambda: u/ kalkulasi ===
 * Nama: Adi memiliki 3 karakter
 * Nama: Didi memiliki 4 karakter
 * Nama: Cici memiliki 4 karakter
 * Nama: Bambang memiliki 7 karakter
 * Total karakter semua nama: 18
 */
