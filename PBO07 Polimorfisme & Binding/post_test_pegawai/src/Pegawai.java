/*
 * Nama File : Pegawai.java
 * Deskripsi : Kelas Pegawai sebagai superclass dari kelas Manajer dan Programmer
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Pegawai {
  // atribut
  protected String nama;
  protected int gajiPokok = 5_000_000;

  // konstructor untuk inisialisasi nama pegawai
  public Pegawai(String nama) {
    this.nama = nama;
  }

  // selektor
  public String getNama() {
    return nama;
  }

  public int getGajiPokok() {
    return gajiPokok;
  }

  // mutator
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setGajiPokok(int gajiPokok) {
    this.gajiPokok = gajiPokok;
  }

  public void tampilData() {
    System.out.println("Nama    : " + nama + ", Gaji pokok : " + gajiPokok);
  }
}
