/* Nama File : Departemen.java
  Deskripsi : Kelas yang merepresentasikan departemen
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class Departemen {
  private String nama;
  private String ketuaDepartemen;
  private double tarifBiayaKebersihan; // tarif per meter persegi

  // Konstruktor
  public Departemen(String nama, String ketuaDepartemen, double tarifBiayaKebersihan) {
    this.nama = nama;
    this.ketuaDepartemen = ketuaDepartemen;
    this.tarifBiayaKebersihan = tarifBiayaKebersihan;
  }

  // Getter dan setter
  public String getNama() {
    return nama;
  }

  public String getKetuaDepartemen() {
    return ketuaDepartemen;
  }

  public double getTarifBiayaKebersihan() {
    return tarifBiayaKebersihan;
  }

  public void setKetuaDepartemen(String ketuaDepartemen) {
    this.ketuaDepartemen = ketuaDepartemen;
  }

  public void setTarifBiayaKebersihan(double tarifBiayaKebersihan) {
    this.tarifBiayaKebersihan = tarifBiayaKebersihan;
  }

  // Method untuk menampilkan informasi departemen
  public String tampilkanInfo() {
    return "Departemen: " + nama +
        "\nKetua: " + ketuaDepartemen +
        "\nTarif Kebersihan: Rp. " + tarifBiayaKebersihan + " per meter persegi";
  }
}