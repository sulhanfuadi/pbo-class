/*
 * Nama File : TestSenjata.java
 * Deskripsi : Kelas untuk menguji Senjata dan KontrolSenjata
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 03 Mei 2025
 */

package latihanMedium;

public class TestSenjata {
  public static void main(String[] args) {
    Senjata ak47 = new Senjata("TAR");
    Senjata m16 = new Senjata("DOR");
    KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
    KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

    // Uji AK-47
    kontrolAK47.menembak(2);
    kontrolAK47.isiPeluru(3);
    kontrolAK47.menembak(5);

    System.out.println("=========================");

    // Uji M16
    kontrolM16.menembak(1);
    kontrolM16.isiPeluru(5);
    kontrolM16.menembak(2);
  }
}
