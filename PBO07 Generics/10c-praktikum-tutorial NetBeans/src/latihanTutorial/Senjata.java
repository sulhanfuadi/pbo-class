/*
 * Nama File  : Senjata.java
 * Deskripsi   : Kelas yang merepresentasikan senjata
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 03 Mei 2025
*/

package latihanTutorial;

public class Senjata {
  private String bunyi;
  private boolean menusuk;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.menusuk = false;
  }

  private String getBunyi() {
    return bunyi;
  }

  private void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  private boolean isMenusuk() {
    return menusuk;
  }

  private void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void menembak(int jumlah) {
    for (int i = 0; i < jumlah; i++) {
      System.out.print(getBunyi() + " ");
    }
    System.out.println();
  }

  public void pasangBayonet() {
    setMenusuk(true);
    System.out.println("Bayonet Terpasang");
  }

  public String menusuk() {
    if (isMenusuk()) {
      return "Jleb!";
    } else {
      return "Gagal, belum pasang bayonet";
    }
  }
}
