/*
 * Nama File : Programmer.java
 * Deskripsi : Kelas Programmer sebagai subclass dari kelas Pegawai
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Programmer extends Pegawai {
  // atribut untuk menyimpan bonus
  private int bonus = 450_000;

  // konstructor untuk inisialisasi nama pegawai
  public Programmer(String nama) {
    super(nama);
  }

  // selektor
  public int getBonus() {
    return bonus;
  }

  // mutator
  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  @Override
  public void tampilData() {
    // memanggil method superclass untuk menampilkan nama & gaji pokok
    super.tampilData();
    System.out.println("Bonus     : " + bonus);
  }
}
