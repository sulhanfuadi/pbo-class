// Nama File : MTitikRefactored.java
// Deskripsi : Uji fungsi dan manipulasi objek dari kelas Titik dengan output yang lebih rapi
// Pembuat   : Sulhan Fuadi (24060123130115)
// Tanggal   : 27 Februari 2025

public class MTitikRefactored {
  public static void main(String[] args) {
    // Header Pengujian
    System.out.println("========================================");
    System.out.println("    Pengujian Objek Titik - Fungsi Dasar  ");
    System.out.println("========================================\n");

    // Uji Pembuatan Objek dan Manipulasi Titik
    System.out.println("-- Pengujian Pembuatan & Manipulasi Titik --");
    Titik tObj = new Titik();
    tObj.setAbsis(3);
    tObj.setOrdinat(4);
    tObj.printTitik();

    tObj.geser(2, 3);
    tObj.printTitik();

    System.out.println("Jarak titik tObj ke (0,0) = " + tObj.getjarakPusat() + "\n");

    // Uji Object Reference
    System.out.println("-- Uji Object Reference --");
    Titik tRef = tObj; // tRef dan tObj menunjuk ke objek yang sama
    tRef.printTitik();

    tObj.setAbsis(10);
    tObj.setOrdinat(20);
    tRef.printTitik(); // Nilai tRef akan ikut berubah

    // Uji Pembuatan Objek Baru
    System.out.println("\n-- Pembuatan Titik Baru --");
    Titik tNew = new Titik(5, 12);
    tNew.printTitik();

    System.out.println("\nJumlah objek titik yang telah dibuat = " + Titik.getCounterTitik() + "\n");

    // Uji Method getKuadran
    System.out.println("----- Pengujian getKuadran -----");
    Titik k1 = new Titik(10, 20); // Kuadran I
    System.out.println("Kuadran (10,20): " + k1.getKuadran());

    Titik k2 = new Titik(-10, 20); // Kuadran II
    System.out.println("Kuadran (-10,20): " + k2.getKuadran());

    Titik k3 = new Titik(-10, -20); // Kuadran III
    System.out.println("Kuadran (-10,-20): " + k3.getKuadran());

    Titik k4 = new Titik(10, -20); // Kuadran IV
    System.out.println("Kuadran (10,-20): " + k4.getKuadran() + "\n");

    // Uji Method getjarakPusat dan getJarak
    System.out.println("----- Pengujian Jarak -----");
    System.out.println("Jarak k1 ke (0,0): " + k1.getjarakPusat());
    System.out.println("Jarak antara k1 dan k2: " + k1.getJarak(k2) + "\n");

    // Uji Refleksi
    System.out.println("----- Pengujian Refleksi -----");
    System.out.print("k1 asal: ");
    k1.printTitik();

    k1.refleksiX();
    System.out.print("Setelah refleksiX: ");
    k1.printTitik();

    k1.refleksiY();
    System.out.print("Setelah refleksiY: ");
    k1.printTitik();

    // Uji getRefleksiX dan getRefleksiY
    System.out.println("\n----- Pengujian Get Refleksi -----");
    Titik refX = k1.getRefleksiX();
    System.out.print("getRefleksiX dari k1: ");
    refX.printTitik();

    Titik refY = k1.getRefleksiY();
    System.out.print("getRefleksiY dari k1: ");
    refY.printTitik();

    System.out.println("\nPengujian selesai.");
  }
}
