/*
 * Nama File : Kucing.java
 * Deskripsi : Kelas Kucing yang merupakan subclass dari Anabul
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
*/

public class Kucing extends Anabul {

  public Kucing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan melata.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: meong.");
  }
}
