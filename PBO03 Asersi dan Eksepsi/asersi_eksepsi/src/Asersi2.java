/*
 * Nama File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

// Kelas Lingkaran, yang memiliki atribut jariJari dan method hitungKeliling
class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari) {
    this.jariJari = jariJari;
  }

  public double hitungKeliling() {
    return 2 * Math.PI * jariJari;
  }
}

// Class Asersi2, menggunakan asersi untuk menolak input jari-jari bernilai nol
// sekaligus menunjukkan cara penggunaan asersi
public class Asersi2 {
  public static void main(String[] args) {
    double jariJari = 0;

    // Asersi: jariJari harus lebih besar dari 0
    assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";

    // Jika asersi diaktifkan, maka program akan berhenti di sini
    Lingkaran l = new Lingkaran(jariJari); // jari-jari bernilai nol
    System.out.println("Keliling lingkaran = " + l.hitungKeliling()); // tidak akan dieksekusi
  }
}

// Setelah itu dilakukan:
// 1. compile dengan ‘javac Asersi2.java’ -> akan muncul Asersi2.class
// 2. jalankan dengan ‘java Asersi2’ -> akan muncul: Keliling
// lingkaran = 0.0
// 3. jalankan dengan ‘java –enableassertions Asersi2’ -> akan muncul pesan
// kesalahan: Exception in thread "main" java.lang.AssertionError: jari-jari
// tidak boleh nol!!!
// at Asersi2.main(Asersi2.java:29)

/*
 * PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di
 * atas, jelaskan!
 *
 * JAWABAN :
 * Penggunaan asersi dalam program di atas kurang tepat karena asersi pada
 * dasarnya dirancang untuk memeriksa kondisi-kondisi yang seharusnya selalu
 * benar selama pengembangan, bukan untuk validasi input yang dapat terjadi di
 * lingkungan produksi. Asersi dapat dinonaktifkan dengan menjalankan program
 * tanpa opsi -–enableassertions, sehingga pemeriksaan terhadap nilai jari-jari
 * tidak akan terjadi dan input yang tidak valid bisa tetap diproses.
 *
 * Oleh karena itu, untuk validasi input seperti jari-jari yang harus lebih
 * besar dari nol, sebaiknya digunakan mekanisme pemeriksaan yang eksplisit,
 * misalnya dengan menggunakan pernyataan if dan melempar exception seperti
 * IllegalArgumentException. Pendekatan ini memastikan bahwa validasi selalu
 * aktif dan program dapat menangani input yang tidak sesuai secara konsisten,
 * tanpa tergantung pada opsi runtime yang digunakan.
 */
