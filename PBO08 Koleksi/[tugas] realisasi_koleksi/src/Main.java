/*
 * Nama File : Main.java
 * Deskripsi : Demo penggunaan kelas Koleksi generic dengan karakter
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 14 Mei 2025
*/

public class Main {
  public static void main(String[] args) {
    // Inisialisasi koleksi karakter
    System.out.println("=== DEMO KOLEKSI KARAKTER ===");
    Koleksi<Character> karakter = new Koleksi<>();

    // Menambahkan karakter A-J ke koleksi
    System.out.println("\n[1] Menambahkan karakter A-J ke koleksi");
    for (char c = 'A'; c <= 'J'; c++) {
      karakter.add(c);
      System.out.print(c + " ");
    }

    // Menampilkan seluruh isi koleksi
    System.out.println("\n\n[2] Menampilkan isi koleksi:");
    karakter.showAll();
    System.out.println("Ukuran koleksi: " + karakter.getSize());

    // Menghapus elemen terakhir dari koleksi
    Character hapus = karakter.delete();
    System.out.println("\n[3] Elemen terakhir yang dihapus: " + hapus);

    // Menampilkan isi koleksi setelah penghapusan
    System.out.println("\n[4] Isi koleksi setelah penghapusan:");
    karakter.showAll();
    System.out.println("Ukuran koleksi sekarang: " + karakter.getSize());
  }
}
