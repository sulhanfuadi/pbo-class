/* Nama File : Ruang.java
  Deskripsi : Kelas dasar yang merepresentasikan ruang secara umum
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public abstract class Ruang {
  private String kode;
  private double panjang;
  private double lebar;
  private double tinggi;
  private int kapasitas;

  // Konstruktor
  public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
    this.kode = kode;
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
    this.kapasitas = kapasitas;
  }

  // Getter dan setter
  public String getKode() {
    return kode;
  }

  public double getPanjang() {
    return panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public double getTinggi() {
    return tinggi;
  }

  public int getKapasitas() {
    return kapasitas;
  }

  // Method untuk menghitung luas ruangan
  public double hitungLuas() {
    return panjang * lebar;
  }

  // Method abstract yang akan diimplementasikan di kelas anak
  public abstract double hitungBiayaKebersihan();

  // Method untuk menampilkan informasi ruangan
  public String tampilkanInfo() {
    return "Kode: " + kode +
        "\nUkuran: " + panjang + " x " + lebar + " x " + tinggi + " meter" +
        "\nKapasitas: " + kapasitas + " orang" +
        "\nLuas: " + hitungLuas() + " meter persegi";
  }
}