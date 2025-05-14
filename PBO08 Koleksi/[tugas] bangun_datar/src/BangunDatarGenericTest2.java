/*
 * Nama File : BangunDatarGenericTest2.java
 * Deskripsi : main class untuk menguji bangun datar baru
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 13 Mei 2025
*/

public class BangunDatarGenericTest2 {
  public static void main(String[] args) {
    // Uji Lingkaran
    Lingkaran lingkaran = new Lingkaran(2);
    BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
    bdgLingkaran.set(lingkaran);
    System.out.println("Lingkaran dengan jari-jari 2:");
    System.out.println("Keliling: " + bdgLingkaran.hitungKeliling());
    System.out.println("Luas: " + bdgLingkaran.hitungLuas());
    System.out.println("Tipe: " + bdgLingkaran.get().getClass().getName());
    System.out.println();

    // Uji Persegi
    Persegi persegi = new Persegi(4);
    BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
    bdgPersegi.set(persegi);
    System.out.println("Persegi dengan sisi 4:");
    System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
    System.out.println("Luas: " + bdgPersegi.hitungLuas());
    System.out.println("Tipe: " + bdgPersegi.get().getClass().getName());
    System.out.println();

    // Uji Persegi Panjang
    PersegiPanjang persegiPanjang = new PersegiPanjang(6, 4);
    BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
    bdgPersegiPanjang.set(persegiPanjang);
    System.out.println("Persegi Panjang dengan panjang 6 dan lebar 4:");
    System.out.println("Keliling: " + bdgPersegiPanjang.hitungKeliling());
    System.out.println("Luas: " + bdgPersegiPanjang.hitungLuas());
    System.out.println("Tipe: " + bdgPersegiPanjang.get().getClass().getName());
    System.out.println();

    // Uji Segitiga
    Segitiga segitiga = new Segitiga(4, 3, 4, 5, 3);
    BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
    bdgSegitiga.set(segitiga);
    System.out.println("Segitiga dengan alas 4, tinggi 3 dan sisi 4, 5, 3:");
    System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
    System.out.println("Luas: " + bdgSegitiga.hitungLuas());
    System.out.println("Tipe: " + bdgSegitiga.get().getClass().getName());
  }
}
