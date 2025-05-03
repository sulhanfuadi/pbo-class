/*
 * Nama File  : Senjata.java
 * Deskripsi   : Kelas yang merepresentasikan senjata
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 03 Mei 2025
*/

package latihanVeryEasy;

public class Senjata {
  // Atribut
  private String bunyi;
  private int peluru;

  // Konstruktor
  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.peluru = 0; // default peluru awal 0
  }

  // Getter dan setter
  public String getBunyi() {
    return bunyi;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  public int getPeluru() {
    return peluru;
  }

  public void setPeluru(int peluru) {
    this.peluru = peluru;
  }

  // Method menembak: cetak bunyi, kurangi peluru, dan tampilkan sisa
  public void menembak() {
    System.out.println(bunyi);
    peluru--;
    System.out.println("Sisa Peluru: " + peluru);
  }
}
