/*
 * Nama File : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi: dasar menggunakan asersi
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

public class Asersi1 {
  public static void main(String[] args) {
    int x = 0;

    if (x > 0) {
      System.out.println("x bilangan positif");
    } else {
      // Asersi di bawah akan dicek ketika -ea (enable assertions) diaktifkan
      assert (x < 0) : "ada kesalahan kode";
      System.out.println("x bilangan negatif");
    }
  }
}

// Setelah itu dilakukan:
// 1. compile dengan ‘javac Asersi1.java’ -> akan muncul Asersi1.class
// 2. jalankan dengan ‘java Asersi1’ -> akan muncul pesan kesalahan: x bilangan
// negatif
// 3. jalankan dengan ‘java –enableassertions Asersi1’ -> akan muncul pesan
// kesalahan: Exception in thread "main" java.lang.AssertionError: ada kesalahan
// kode at Asersi1.main(Asersi1.java:16)
