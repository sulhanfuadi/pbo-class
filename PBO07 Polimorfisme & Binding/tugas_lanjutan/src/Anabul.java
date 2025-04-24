/*
 * Nama File : Anabul.java
 * Deskripsi : Kelas abstrak Anabul yang menjadi superclass untuk Kucing, Anjing, dan Burung
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
*/

public abstract class Anabul {
  protected String nama;

  public Anabul(String nama) {
    this.nama = nama;
  }

  // Metode abstrak untuk gerakan
  public abstract void gerak();

  // Metode abstrak untuk suara
  public abstract void bersuara();

  public String getNama() {
    return nama;
  }
}
