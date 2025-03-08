/*
 * Nama File : Asersi2Scanner.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol, dengan menggunakan Scanner.
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

import java.util.Scanner;

// Kelas Lingkaran, yang memiliki atribut jariJari dan method hitungKeliling
class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari) {
    // Asersi pada konstruktor: menolak jari-jari yang tidak valid
    assert (jariJari > 0) : "jari-jari tidak boleh nol atau negatif!!!";
    this.jariJari = jariJari;
  }

  public double hitungKeliling() {
    return 2 * Math.PI * jariJari;
  }
}

public class Asersi2Scanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Membuat objek scanner

    System.out.print("Masukkan jari-jari lingkaran: ");
    double jariJari = scanner.nextDouble(); // Membaca input jari-jari
    scanner.close(); // Menutup scanner

    // Asersi: jariJari harus lebih besar dari 0
    assert (jariJari > 0) : "jari-jari tidak boleh nol atau negatif!!!";

    // Jika asersi di atas terpenuhi, kode di bawah akan dieksekusi
    Lingkaran l = new Lingkaran(jariJari);
    System.out.println("Keliling lingkaran = " + l.hitungKeliling());
  }
}
