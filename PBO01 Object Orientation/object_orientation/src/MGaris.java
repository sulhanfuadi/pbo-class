/* Nama File : MGaris.java
  Deskripsi : Uji coba fungsi dan manipulasi objek dari kelas Garis
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Februari 2025
*/

public class MGaris {
  public static void main(String[] args) {
    System.out.println("===========================================");
    System.out.println("     Pengujian Kelas Garis (Objek Garis)   ");
    System.out.println("===========================================\n");

    // 1. Uji konstruktor default
    System.out.println(">> Pengujian Konstruktor Default");
    Garis g1 = new Garis();
    System.out.println("Garis g1:");
    g1.printGaris();
    System.out.println("Panjang g1: " + g1.getPanjang());
    System.out.println("Gradien g1: " + g1.getGradien());
    System.out.print("Titik Tengah g1: ");
    g1.getTitikTengah().printTitik();
    System.out.println();

    // 2. Uji konstruktor dengan parameter
    System.out.println(">> Pengujian Konstruktor dengan Parameter");
    Titik t1 = new Titik(2, 3);
    Titik t2 = new Titik(8, 11);
    Garis g2 = new Garis(t1, t2);
    System.out.println("Garis g2:");
    g2.printGaris();
    System.out.println("Panjang g2: " + g2.getPanjang());
    System.out.println("Gradien g2: " + g2.getGradien());
    System.out.print("Titik Tengah g2: ");
    g2.getTitikTengah().printTitik();
    System.out.println();

    // 3. Uji fungsi isSejajar
    System.out.println(">> Pengujian isSejajar");
    // Membuat garis lain dengan gradien yang sama seperti g2
    Garis g3 = new Garis(new Titik(0, 0), new Titik(6, 10)); // gradien = (10-0)/(6-0)=1.67 (approx)
    System.out.println("Garis g2 dan g3 sejajar? " + g2.isSejajar(g3));
    System.out.println();

    // 4. Uji fungsi isTegakLurus
    System.out.println(">> Pengujian isTegakLurus");
    // Membuat garis dengan gradien negatif resiprokal dari g2
    Garis g4 = new Garis(new Titik(0, 0), new Titik(6, -8));
    System.out.println("Garis g2 dan g4 tegak lurus? " + g2.isTegakLurus(g4));
    System.out.println();

    // 5. Uji Print Persamaan Garis
    System.out.println(">> Pengujian Print Persamaan Garis");
    System.out.print("Persamaan garis g2: ");
    g2.printPersamaanGaris();
    System.out.println();

    // 6. Tampilkan jumlah objek Garis yang dibuat (menggunakan counterGaris)
    System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
  }
}