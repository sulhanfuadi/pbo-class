/* Nama File : RuangKelas.java
  Deskripsi : Kelas untuk ruang kelas
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class RuangKelas extends RuangFakultas {
  private int jumlahKursiTersedia;
  private int jumlahKursiRusak;

  // Konstruktor
  public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      int jumlahKursiTersedia, int jumlahKursiRusak) {
    super(kode, panjang, lebar, tinggi, kapasitas);
    this.jumlahKursiTersedia = jumlahKursiTersedia;
    this.jumlahKursiRusak = jumlahKursiRusak;
  }

  // Getter dan setter
  public int getJumlahKursiTersedia() {
    return jumlahKursiTersedia;
  }

  public int getJumlahKursiRusak() {
    return jumlahKursiRusak;
  }

  public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
    this.jumlahKursiTersedia = jumlahKursiTersedia;
  }

  public void setJumlahKursiRusak(int jumlahKursiRusak) {
    this.jumlahKursiRusak = jumlahKursiRusak;
  }

  // Method untuk menghitung total kursi
  public int hitungTotalKursi() {
    return jumlahKursiTersedia + jumlahKursiRusak;
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return "=== RUANG KELAS ===\n" +
        super.tampilkanInfo() +
        "\nJumlah Kursi Tersedia: " + jumlahKursiTersedia +
        "\nJumlah Kursi Rusak: " + jumlahKursiRusak +
        "\nTotal Kursi: " + hitungTotalKursi() +
        "\nBiaya Kebersihan: Rp. " + hitungBiayaKebersihan();
  }
}