/*
 * Nama File : Programmer.java
 * Deskripsi : Kelas Programmer sebagai subclass dari kelas Pegawai
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Programmer extends Pegawai {
  private int bonus = 450_000;

  public Programmer(String nama) {
    super(nama);
  }

  @Override
  public void tampilData() {
    // memanggil method superclass untuk menampilkan nama & gaji pokok
    super.tampilData();
    System.out.println("Bonus     : " + bonus);
  }
}
