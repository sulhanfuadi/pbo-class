/*
 * Nama File : PersegiPanjang.java
 * Deskripsi : implementasi PersegiPanjang sebagai BangunDatar
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 13 Mei 2025
*/

public class PersegiPanjang extends BangunDatar {
  private double panjang;
  private double lebar;

  public PersegiPanjang(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public double hitungKeliling() {
    return 2 * (panjang + lebar);
  }

  public double hitungLuas() {
    return panjang * lebar;
  }
}
