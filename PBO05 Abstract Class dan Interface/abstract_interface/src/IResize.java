/* Nama File : IResize.java
  Deskripsi : Interface yang mendefinisikan kemampuan resize suatu objek
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Maret 2025
*/

public interface IResize {
  // Method untuk memperbesar ukuran objek menjadi 10% lebih besar
  void zoomIn();

  // Method untuk memperkecil ukuran objek menjadi 10% lebih kecil
  void zoomOut();

  // Method untuk mengubah ukuran objek sesuai dengan persentase yang diberikan
  void zoom(double percent);
}

/*
 * JAWABAN PERTANYAAN PRAKTIKUM:
 * =============================
 * 
 * Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam
 * interface IResize dibanding dijadikan sebagai abstract method dalam class
 * BangunDatar?
 * 
 * 1. Fleksibilitas dan Multiple Inheritance
 * Java tidak mendukung multiple inheritance untuk class, tetapi class dapat
 * mengimplementasikan banyak interface. Jika kita meletakkan metode resize
 * sebagai abstract method dalam BangunDatar, maka class lain yang bukan
 * turunan dari BangunDatar tidak dapat memanfaatkan kemampuan resize.
 * 
 * 2. Pemisahan Concern (Separation of Concerns)
 * Interface memisahkan kemampuan resize (behavior) dari identitas suatu objek.
 * Tidak semua BangunDatar perlu memiliki kemampuan resize, sehingga lebih baik
 * memisahkannya ke dalam interface terpisah.
 * 
 * 3. Reusability (Penggunaan Kembali)
 * Interface IResize dapat digunakan oleh class lain yang tidak terkait dengan
 * BangunDatar, seperti Garis, Bangun3D (Kubus, Bola), atau bahkan komponen
 * GUI seperti Window, Image, dll.
 * 
 * 4. Contract-based Programming
 * Interface memberikan kontrak yang jelas tentang kemampuan yang harus dimiliki
 * tanpa mengharuskan pewarisan dari class tertentu. Ini memungkinkan
 * kelas-kelas dari hierarki yang berbeda untuk memiliki kemampuan yang sama.
 * 
 * 5. Loose Coupling (Pengikatan Longgar)
 * Penggunaan interface mengurangi ketergantungan antar komponen sistem, karena
 * kode kita dapat bekerja dengan abstraksi interface daripada implementasi
 * konkret.
 * 
 * 6. Polymorphism yang Lebih Luas
 * Kita dapat membuat koleksi objek IResize yang dapat berisi objek dari
 * berbagai kelas yang berbeda, tidak terbatas pada turunan BangunDatar.
 * 
 * Dengan interface, kita mendapatkan fleksibilitas yang lebih besar dan dapat
 * menerapkan prinsip "Program to an interface, not an implementation" yang
 * merupakan best practice dalam pemrograman berorientasi objek.
 */
