/*
 * Nama File : Burung.java
 * Deskripsi : Kelas Burung yang merupakan subclass dari Anabul
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
*/

public class Burung extends Anabul {

  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan terbang.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: cuit.");
  }
}
