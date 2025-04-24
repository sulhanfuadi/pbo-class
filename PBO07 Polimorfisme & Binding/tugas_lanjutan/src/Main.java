/*
 * Nama File : Main.java
 * Deskripsi : Kelas Main untuk menguji kelas Anabul dan subclass-nya
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Buat objek-objek Anabul
    Anabul anabul1 = new Kucing("Kitty");
    Anabul anabul2 = new Anjing("Doggy");
    Anabul anabul3 = new Burung("Tweety");

    // Buat ArrayList untuk menyimpan Anabul
    ArrayList<Anabul> koleksi = new ArrayList<>();
    koleksi.add(anabul1);
    koleksi.add(anabul2);
    koleksi.add(anabul3);

    // Simulasikan gerak dan suara setiap anabul
    for (Anabul a : koleksi) {
      System.out.println("=== " + a.getNama() + " ===");
      a.gerak();
      a.bersuara();
      System.out.println();
    }
  }
}

/*
 * SE-cuil PELAJARAN DARI TUGAS LANJUTAN (Polimorfisme):
 * 1. Polimorfisme Inclusion: Objek dari kelas turunan (Kucing, Anjing, Burung)
 * dapat diperlakukan sebagai objek dari kelas induknya (Anabul). Hal ini
 * terlihat saat objek-objek tersebut dimasukkan ke dalam ArrayList<Anabul>.
 * Kita dapat menyimpan berbagai jenis anabul dalam satu koleksi yang sama.
 *
 * 2. Method Overriding: Kelas Kucing, Anjing, dan Burung meng-override
 * (menyediakan implementasi spesifik) metode abstrak gerak() dan bersuara()
 * yang didefinisikan di kelas Anabul. Setiap kelas anak memberikan perilaku
 * unik untuk metode-metode tersebut sesuai dengan jenis hewannya.
 *
 * 3. Dynamic Binding (Runtime Polymorphism): Ketika loop `for (Anabul a :
 * koleksi)` dijalankan, pemanggilan metode `a.gerak()` dan `a.bersuara()` akan
 * mengeksekusi implementasi metode dari objek *aktual* yang dirujuk oleh `a`
 * pada saat runtime (misalnya, Kucing.gerak(), Anjing.bersuara(), dll.),
 * bukan metode dari kelas Anabul (yang abstrak). Java secara dinamis
 * menentukan metode mana yang harus dipanggil berdasarkan tipe objek
 * sebenarnya.
 *
 * 4. Manfaat:
 * - Fleksibilitas: Kode di `main` dapat bekerja dengan berbagai jenis Anabul
 * tanpa perlu mengetahui tipe spesifiknya saat kompilasi.
 * - Ekstensibilitas: Mudah untuk menambahkan jenis Anabul baru (misalnya,
 * Hamster) dengan membuat kelas baru yang mewarisi Anabul dan meng-override
 * metodenya, tanpa perlu mengubah kode loop di `main`.
 * - Kode Lebih Rapi: Menghindari penggunaan banyak `if-else` atau `instanceof`
 * untuk memeriksa tipe objek dan memanggil metode yang sesuai.
 */
