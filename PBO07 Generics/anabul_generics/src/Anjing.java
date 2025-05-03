/*
 * Nama File  : Anjing.java
 * Deskripsi   : Subclass Anjing, override gerak() & bersuara(), plus metode fetch()
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 27 April 2025
*/

public class Anjing extends Anabul {

  // Konstruktor
  public Anjing(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  // Override metode gerak() dari superclass Anabul
  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan berlari.");
  }

  // Override metode bersuara() dari superclass Anabul
  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: guk-guk!!!");
  }

  // Metode khusus Anjing
  public void fetch() {
    System.out.println(nama + " mengambil bola.");
  }
}