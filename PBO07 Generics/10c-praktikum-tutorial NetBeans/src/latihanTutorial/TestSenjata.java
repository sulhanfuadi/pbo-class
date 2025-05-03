/*
 * Nama File  : TestSenjata.java
 * Deskripsi   : Kelas yang menguji kelas Senjata
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 03 Mei 2025
*/

package latihanTutorial;

public class TestSenjata {
  public static void main(String[] args) {
    Senjata ak47 = new Senjata("TAR");
    Senjata m16 = new Senjata("DOR");

    System.out.print("AK47 Menembak 3x: ");
    ak47.menembak(3);

    System.out.print("M16 Menembak 1x: ");
    m16.menembak(1);

    System.out.println("AK47 menusuk: " + ak47.menusuk());
    // System.out.println("M16 menusuk: " + m16.menusuk());

    ak47.pasangBayonet();

    System.out.println("AK47 menusuk: " + ak47.menusuk());
  }
}
