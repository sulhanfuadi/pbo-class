/*
 * Nama File : Overloading.java
 * Deskripsi : Penjelasan dan contoh Polimorfisme Ad Hoc (Overloading)
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

/*
 * Penjelasan:
 * Polimorfisme Ad Hoc, atau yang lebih dikenal sebagai Method Overloading,
 * adalah kemampuan dalam sebuah kelas untuk mendefinisikan beberapa method
 * dengan nama yang sama, tetapi memiliki parameter yang berbeda. Perbedaan
 * parameter ini bisa berupa:
 * 1. Jumlah parameter yang berbeda.
 * 2. Tipe data parameter yang berbeda.
 * 3. Urutan tipe data parameter yang berbeda (jika tipe datanya berbeda).
 *
 * Kompiler Java akan menentukan method mana yang akan dipanggil berdasarkan
 * argumen yang diberikan saat pemanggilan method pada waktu kompilasi (compile time).
 * Oleh karena itu, overloading juga sering disebut sebagai Compile-time Polymorphism
 * atau Static Polymorphism.
 *
 * Syarat-syarat Method Overloading:
 * 1. Nama Method Harus Sama: Semua method yang di-overload harus memiliki nama yang identik.
 * 2. Daftar Parameter Harus Berbeda: Perbedaan harus ada pada jumlah, tipe, atau urutan tipe parameter.
 * 3. Return Type Tidak Cukup: Perbedaan hanya pada return type tidak dianggap sebagai overloading.
 *    Method dengan nama dan parameter yang sama tetapi return type berbeda akan menyebabkan error kompilasi.
 * 4. Access Modifier Boleh Berbeda: Method yang di-overload boleh memiliki access modifier yang berbeda.
 * 5. Exception yang Dilempar Boleh Berbeda: Method yang di-overload boleh melempar exception yang berbeda.
 */

// Contoh Overloading pada Konstruktor (dari PBO04/inheritance/src/BangunDatar.java)
class ContohBangunDatar {
  protected int jmlSisi;
  protected String warna;
  protected String border;

  // Konstruktor 1: Tanpa parameter
  public ContohBangunDatar() {
    this.jmlSisi = 0;
    this.warna = "default";
    this.border = "default";
    System.out.println("Konstruktor BangunDatar tanpa parameter dipanggil.");
  }

  // Konstruktor 2: Dengan 3 parameter (Overloading)
  public ContohBangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    System.out.println("Konstruktor BangunDatar dengan 3 parameter dipanggil.");
  }

  // Konstruktor 3: Dengan 2 parameter (Overloading) - Contoh lain
  public ContohBangunDatar(int jmlSisi, String warna) {
    this(jmlSisi, warna, "solid"); // Memanggil konstruktor lain (constructor chaining)
    System.out.println("Konstruktor BangunDatar dengan 2 parameter dipanggil.");
  }
}

// Contoh Overloading pada Method Biasa
class Kalkulator {
  // Method 1: Penjumlahan dua integer
  public int tambah(int a, int b) {
    System.out.println("Memanggil tambah(int, int)");
    return a + b;
  }

  // Method 2: Penjumlahan tiga integer (Overloading - jumlah parameter beda)
  public int tambah(int a, int b, int c) {
    System.out.println("Memanggil tambah(int, int, int)");
    return a + b + c;
  }

  // Method 3: Penjumlahan dua double (Overloading - tipe parameter beda)
  public double tambah(double a, double b) {
    System.out.println("Memanggil tambah(double, double)");
    return a + b;
  }

  // Method 4: Penjumlahan integer dan double (Overloading - urutan tipe parameter
  // beda)
  public double tambah(int a, double b) {
    System.out.println("Memanggil tambah(int, double)");
    return a + b;
  }

  // Method 5: Penjumlahan double dan integer (Overloading - urutan tipe parameter
  // beda)
  public double tambah(double a, int b) {
    System.out.println("Memanggil tambah(double, int)");
    return a + b;
  }

  // Ini BUKAN overloading, hanya berbeda return type -> Error Kompilasi jika
  // uncomment
  // public double tambah(int a, int b) {
  // System.out.println("Ini akan menyebabkan error");
  // return (double)(a + b);
  // }
}

public class Overloading {
  public static void main(String[] args) {
    System.out.println("--- Contoh Overloading Konstruktor ---");
    ContohBangunDatar bd1 = new ContohBangunDatar();
    ContohBangunDatar bd2 = new ContohBangunDatar(4, "Merah", "Garis Putus");
    ContohBangunDatar bd3 = new ContohBangunDatar(3, "Biru");

    System.out.println("Jumlah sisi bd1: " + bd1.jmlSisi + ", Warna: " + bd1.warna + ", Border: " + bd1.border);
    System.out.println("Jumlah sisi bd2: " + bd2.jmlSisi + ", Warna: " + bd2.warna + ", Border: " + bd2.border);
    System.out.println("Jumlah sisi bd3: " + bd3.jmlSisi + ", Warna: " + bd3.warna + ", Border: " + bd3.border);

    System.out.println("\n--- Contoh Overloading Method ---");
    Kalkulator calc = new Kalkulator();
    System.out.println("Hasil 5 + 10 = " + calc.tambah(5, 10));
    System.out.println("Hasil 5 + 10 + 15 = " + calc.tambah(5, 10, 15));
    System.out.println("Hasil 3.5 + 2.7 = " + calc.tambah(3.5, 2.7));
    System.out.println("Hasil 5 + 4.2 = " + calc.tambah(5, 4.2));
    System.out.println("Hasil 6.1 + 9 = " + calc.tambah(6.1, 9));
  }
}

// Contoh lain dari proyek sebelumnya:
// - Konstruktor Titik(double, double) dan Titik() di PBO01 & PBO02
// - Konstruktor Garis(Titik, Titik) dan Garis() di PBO01 & PBO02
// - Konstruktor Persegi(...) dan Lingkaran(...) di PBO04 & PBO05
// - Method hitungTotalBiayaKebersihan(...) di Main.java PBO06 (Responsi)
