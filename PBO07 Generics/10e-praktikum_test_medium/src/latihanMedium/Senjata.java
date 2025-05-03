/*
 * Nama File : Senjata.java
 * Deskripsi : Kelas yang merepresentasikan senjata
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 03 Mei 2025
 */

package latihanMedium;

public class Senjata {
  private String bunyi;
  private boolean menusuk;
  private int peluru;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.menusuk = false;
    this.peluru = 0;
  }

  public String getBunyi() {
    return bunyi;
  }

  public int getPeluru() {
    return peluru;
  }

  public boolean isMenusuk() {
    return menusuk;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  public void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void setPeluru(int peluru) {
    this.peluru = peluru;
  }
}
