/*
 * Nama File : Pegawai.java
 * Deskripsi : Kelas Pegawai sebagai superclass dari kelas Manajer dan Programmer
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Pegawai {
  protected String nama;
  protected int gajiPokok = 5_000_000;

  public Pegawai(String nama) {
    this.nama = nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void tampilData() {
    System.out.println("Nama    : " + nama + ", Gaji pokok : " + gajiPokok);
  }
}
