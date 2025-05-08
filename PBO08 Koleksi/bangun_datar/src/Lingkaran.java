/*
 * Nama File : Lingkaran.java
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 08 Mei 2025
*/

public class Lingkaran extends BangunDatar {
  private double jejari;

  public Lingkaran(double jejari) {
    this.jejari = jejari;
  }

  public double hitungKeliling() {
    return 2 * jejari * 3.14;
  }
}
