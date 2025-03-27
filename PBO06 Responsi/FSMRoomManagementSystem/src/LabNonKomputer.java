/* Nama File : LabNonKomputer.java
  Deskripsi : Kelas untuk laboratorium non-komputer
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

import java.util.ArrayList;
import java.util.List;

public class LabNonKomputer extends RuangLaboratorium {
  private List<String> mataKuliah; // Daftar mata kuliah yang ditangani lab
  private String kategoriLab; // misal: Biologi, Fisika, Kimia

  // Konstruktor
  public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      String namaLab, double hargaSewa, String kategoriLab) {
    super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
    this.kategoriLab = kategoriLab;
    this.mataKuliah = new ArrayList<>();
  }

  // Getter dan setter
  public String getKategoriLab() {
    return kategoriLab;
  }

  // Method untuk menambahkan mata kuliah
  public void tambahMataKuliah(String matkul) {
    mataKuliah.add(matkul);
  }

  // Method untuk mendapatkan daftar mata kuliah
  public List<String> getMataKuliah() {
    return mataKuliah;
  }

  // Implementasi method abstract getJenisLab()
  @Override
  public String getJenisLab() {
    return "Laboratorium " + kategoriLab;
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    StringBuilder info = new StringBuilder(super.tampilkanInfo());
    info.append("\nKategori: ").append(kategoriLab);
    info.append("\nMata Kuliah yang ditangani:");

    if (mataKuliah.isEmpty()) {
      info.append(" Belum ada");
    } else {
      for (String mk : mataKuliah) {
        info.append("\n  - ").append(mk);
      }
    }

    return info.toString();
  }
}