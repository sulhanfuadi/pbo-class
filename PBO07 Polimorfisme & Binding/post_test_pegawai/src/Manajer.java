/*
 * Nama File : Manajer.java
 * Deskripsi : Kelas Manajer sebagai subclass dari kelas Pegawai
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Manajer extends Pegawai {
  private int tunjangan = 700_000;

  public Manajer(String nama) {
    super(nama);
  }

  @Override
  public void tampilData() {
    // memanggil method superclass untuk menampilkan nama & gaji pokok
    super.tampilData();
    System.out.println("Tunjangan : " + tunjangan);
  }
}
