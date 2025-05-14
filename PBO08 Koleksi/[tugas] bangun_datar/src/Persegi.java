/*
 * Nama File : Persegi.java
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 13 Mei 2025
*/

public class Persegi extends BangunDatar {
  private double sisi;

  public Persegi(double sisi) {
    this.sisi = sisi;
  }

  public double hitungKeliling() {
    return 4 * sisi;
  }

  public double hitungLuas() {
    return sisi * sisi;
  }
}