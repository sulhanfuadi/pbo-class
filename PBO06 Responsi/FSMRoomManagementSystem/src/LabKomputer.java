/* Nama File : LabKomputer.java
  Deskripsi : Kelas untuk laboratorium komputer
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class LabKomputer extends RuangLaboratorium {
  private int jumlahKomputer;

  // Konstruktor
  public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      String namaLab, double hargaSewa, int jumlahKomputer) {
    super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
    this.jumlahKomputer = jumlahKomputer;
  }

  // Getter dan setter
  public int getJumlahKomputer() {
    return jumlahKomputer;
  }

  public void setJumlahKomputer(int jumlahKomputer) {
    this.jumlahKomputer = jumlahKomputer;
  }

  // Implementasi method abstract getJenisLab()
  @Override
  public String getJenisLab() {
    return "Laboratorium Komputer";
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return super.tampilkanInfo() +
        "\nJumlah Komputer: " + jumlahKomputer;
  }
}