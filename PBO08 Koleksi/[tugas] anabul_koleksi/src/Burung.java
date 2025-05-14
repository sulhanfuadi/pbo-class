/*
 * Nama File  : Burung.java
 * Deskripsi   : Subclass Burung, override gerak() & bersuara(), plus metode terbangTinggi()
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 27 April 2025
*/

public class Burung extends Anabul {

  // Konstruktor
  public Burung(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  // Override metode gerak() dari superclass Anabul
  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan terbang.");
  }

  // Override metode bersuara() dari superclass Anabul
  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: cuit!!!");
  }

  // Metode khusus Burung
  public void terbangTinggi() {
    System.out.println(nama + " sedang terbang tinggi ke atas awan.");
  }
}
