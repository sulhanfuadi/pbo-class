/* Nama File : Manusia.java
  Deskripsi : Kelas abstrak Manusia merupakan kelas dasar yang merepresentasikan manusia.
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Maret 2025
*/

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Manusia {
  private String nama;
  private Date tgl_mulai_kerja;
  private String alamat;
  private double pendapatan;
  private static int counterMns = 0;

  // Konstruktor tanpa parameter
  public Manusia() {
    this.nama = "Belum diisi";
    this.tgl_mulai_kerja = new Date();
    this.alamat = "Belum diisi";
    this.pendapatan = 0;
    counterMns++;
  }

  // Konstruktor dengan parameter
  public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan) {
    this.nama = nama;
    this.tgl_mulai_kerja = tgl_mulai_kerja;
    this.alamat = alamat;
    this.pendapatan = pendapatan;
    counterMns++;
  }

  // Method to print info
  public void cetakInfo() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println("Nama: " + nama);
    System.out.println("Tanggal Mulai Kerja: " + dateFormat.format(tgl_mulai_kerja));
    System.out.println("Alamat: " + alamat);
    System.out.println("Pendapatan: " + pendapatan);
  }

  // Abstract method untuk menghitung pajak
  protected abstract int hitungMasaKerja();

  // Getters and Setters
  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Date getTglMulaiKerja() {
    return tgl_mulai_kerja;
  }

  public void setTglMulaiKerja(Date tgl) {
    this.tgl_mulai_kerja = tgl;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public double getPendapatan() {
    return pendapatan;
  }

  public void setPendapatan(double pendapatan) {
    this.pendapatan = pendapatan;
  }

  public static int getCounterMns() {
    return counterMns;
  }
}
