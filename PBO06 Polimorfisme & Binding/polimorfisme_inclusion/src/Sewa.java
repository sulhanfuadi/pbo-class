/*
 * Nama File : Sewa.java
 * Deskripsi : Kelas Sewa untuk menghitung sewa kendaraan
 * Kelas ini menggunakan metode utilitas hitungSewa() untuk menghitung sewa
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Sewa {
  // metode utilitas yang hanya tahu tipe Vehicle
  static void hitungSewa(Vehicle v, int jarak, float hargaPerKm) {
    v.calRent(jarak, hargaPerKm);
  }

  public static void main(String[] args) {
    Vehicle kendaraan = new Vehicle();
    Vehicle mobil = new Car();
    Vehicle bis = new Bus();

    System.out.println("=== Tanpa hitungSewa ===");
    kendaraan.calRent(50, 1000);
    mobil.calRent(50, 1000);
    bis.calRent(50, 1000);

    System.out.println("\n=== Dengan hitungSewa ===");
    hitungSewa(kendaraan, 50, 1000);
    hitungSewa(mobil, 50, 1000);
    hitungSewa(bis, 50, 1000);
  }
}

/*
 * Analisis Keuntungan Penggunaan Teknik Polimorfisme Inclusion pada method
 * hitungSewa(Vehicle v, int jarak, float hargaPerKm):
 *
 * 1. Generalitas dan Fleksibilitas:
 * Metode `hitungSewa` dapat menerima objek dari kelas `Vehicle` maupun
 * *semua* subclass-nya (`Car`, `Bus`, atau kelas turunan `Vehicle` lainnya
 * yang mungkin dibuat di masa depan) tanpa perlu mengubah kode metode
 * `hitungSewa` itu sendiri. Ini karena objek subclass dapat diperlakukan
 * sebagai objek superclass (prinsip upcasting).
 *
 * 2. Kode Lebih Ringkas dan Mudah Dipelihara:
 * Kita tidak perlu membuat metode terpisah untuk setiap jenis kendaraan
 * (misalnya, `hitungSewaMobil`, `hitungSewaBis`). Cukup satu metode
 * `hitungSewa` yang bekerja untuk semua jenis `Vehicle`. Ini mengurangi
 * duplikasi kode dan memudahkan pemeliharaan. Jika ada perubahan logika
 * perhitungan sewa yang umum, cukup ubah di satu tempat.
 *
 * 3. Ekstensibilitas:
 * Jika di kemudian hari ada penambahan kelas baru yang merupakan turunan
 * dari `Vehicle` (misalnya, `Truck`), metode `hitungSewa` akan langsung
 * bisa digunakan untuk objek `Truck` tersebut tanpa perlu modifikasi,
 * asalkan kelas `Truck` mengimplementasikan metode `calRent` (atau
 * menggunakan implementasi default dari `Vehicle` jika tidak di-override).
 * Sistem menjadi lebih mudah dikembangkan.
 *
 * Secara ringkas, polimorfisme inclusion memungkinkan penulisan kode yang
 * lebih generik, fleksibel, dan mudah dikembangkan untuk bekerja dengan
 * berbagai objek yang memiliki hubungan warisan (inheritance). Metode
 * `hitungSewa` menjadi lebih reusable dan adaptif terhadap penambahan
 * jenis-jenis `Vehicle` baru.
 */
