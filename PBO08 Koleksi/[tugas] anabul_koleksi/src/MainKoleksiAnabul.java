/*
 * Nama File  : MainKoleksiAnabul.java
 * Deskripsi   : Kelas MainKoleksiAnabul untuk menguji kelas Koleksi
 *               dengan objek-objek Anabul
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 14 Mei 2025
*/

import java.util.Random;

public class MainKoleksiAnabul {
  public static void main(String[] args) {
    Koleksi<Anabul> koleksi = new Koleksi<>();
    Random rnd = new Random();

    // generate 10 elemen acak
    for (int i = 1; i < 11; i++) {
      int jenis = rnd.nextInt(3);
      int umur = rnd.nextInt(5) + 1; // Random age between 1-5
      String jenisKelamin = (rnd.nextBoolean() ? "Jantan" : "Betina");
      String warna = "Warna" + i;

      switch (jenis) {
        case 0:
          koleksi.add(new Kucing("Kucing" + i, umur, jenisKelamin, warna));
          break;
        case 1:
          koleksi.add(new Anjing("Anjing" + i, umur, jenisKelamin, warna));
          break;
        default:
          koleksi.add(new Burung("Burung" + i, umur, jenisKelamin, warna));
          break;
      }
    }

    // tampilkan informasi setiap anabul
    System.out.println("=== Koleksi Anabul ===");
    for (int i = 0; i < koleksi.getSize(); i++) {
      Anabul a = koleksi.getIsi(i);
      System.out.print("Anabul #" + (i + 1) + ": ");
      a.info();
    }

    System.out.println("\n=== Aksi Anabul ===");
    for (int i = 0; i < koleksi.getSize(); i++) {
      Anabul a = koleksi.getIsi(i);
      System.out.printf("%s: ", a.getNama());
      a.bersuara();
      a.gerak();
      System.out.println();
    }

    // Demo hapus anabul
    System.out.println("\n=== Menghapus Anabul Terakhir ===");
    Anabul dihapus = koleksi.delete();
    if (dihapus != null) {
      System.out.print("Anabul yang dihapus: ");
      dihapus.info();
    }
  }
}
