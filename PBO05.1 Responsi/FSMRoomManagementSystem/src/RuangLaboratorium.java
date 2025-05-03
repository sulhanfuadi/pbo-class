/* Nama File : RuangLaboratorium.java
  Deskripsi : Kelas abstrak untuk laboratorium
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public abstract class RuangLaboratorium extends RuangFakultas {
  private String namaLab;
  private double hargaSewa;

  // Konstruktor
  public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      String namaLab, double hargaSewa) {
    super(kode, panjang, lebar, tinggi, kapasitas);
    this.namaLab = namaLab;
    this.hargaSewa = hargaSewa;
  }

  // Getter dan setter
  public String getNamaLab() {
    return namaLab;
  }

  public double getHargaSewa() {
    return hargaSewa;
  }

  public void setHargaSewa(double hargaSewa) {
    this.hargaSewa = hargaSewa;
  }

  // Method abstract untuk mendapatkan jenis laboratorium
  public abstract String getJenisLab();

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return "=== LABORATORIUM ===\n" +
        super.tampilkanInfo() +
        "\nNama Lab: " + namaLab +
        "\nJenis Lab: " + getJenisLab() +
        "\nHarga Sewa: Rp. " + hargaSewa +
        "\nBiaya Kebersihan: Rp. " + hitungBiayaKebersihan();
  }
}