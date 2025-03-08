/*
 * Nama File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

public class ExceptionOnArray {
  public static void main(String[] args) {
    Integer[] arrayInteger = new Integer[4];
    // Array dengan panjang 4

    try {
      // Index ke-2 masih valid (0,1,2,3),
      // jika ingin memicu ArrayIndexOutOfBoundsException, bisa ganti jadi index 4.
      arrayInteger[2] = 11; // Memasukkan nilai 11 ke index ke-2
      arrayInteger[4] = 10; // Memasukkan nilai 10 ke index ke-4, menyebabkan ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace(); // Menampilkan stack trace, pesan kesalahan, dan baris kode yang menyebabkan
                           // kesalahan
    } finally {
      System.out.println("Clean up code..."); // Baris kode yang akan dieksekusi setelah try-catch, pasti
                                              // dieksekusi
    }
  }
}

// Setelah itu dilakukan:
// 1. compile dengan ‘javac ExceptionOnArray.java’ -> akan muncul
// ExceptionOnArray.class
// 2. jalankan dengan ‘java ExceptionOnArray’ -> akan muncul pesan kesalahan:
// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
// at ExceptionOnArray.main(ExceptionOnArray.java:17)
// Clean up code...
