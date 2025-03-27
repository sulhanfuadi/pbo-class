/* Nama File : RuangCounter.java
  Deskripsi : Kelas utilitas untuk menghitung statistik ruangan
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

import java.util.ArrayList;
import java.util.List;

public class RuangCounter {
  private List<Ruang> daftarRuang;

  // Konstruktor
  public RuangCounter() {
    this.daftarRuang = new ArrayList<>();
  }

  // Method untuk menambahkan ruang ke dalam daftar
  public void tambahRuang(Ruang ruang) {
    daftarRuang.add(ruang);
  }

  // Method untuk menghitung jumlah ruang kelas
  public int hitungJumlahRuangKelas() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof RuangKelas) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menghitung jumlah laboratorium
  public int hitungJumlahLab() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof RuangLaboratorium) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menghitung jumlah lab komputer
  public int hitungJumlahLabKomputer() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof LabKomputer) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menghitung jumlah lab non-komputer
  public int hitungJumlahLabNonKomputer() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof LabNonKomputer) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menghitung jumlah ruang kantor departemen
  public int hitungJumlahRuangKantorDepartemen() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof RuangKantorDepartemen) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menghitung jumlah ruang dosen
  public int hitungJumlahRuangDosen() {
    int count = 0;
    for (Ruang ruang : daftarRuang) {
      if (ruang instanceof RuangDosen) {
        count++;
      }
    }
    return count;
  }

  // Method untuk menampilkan ringkasan statistik ruangan
  public String tampilkanStatistik() {
    return "=== STATISTIK RUANGAN ===\n" +
        "Total Ruang: " + daftarRuang.size() + "\n" +
        "Jumlah Ruang Kelas: " + hitungJumlahRuangKelas() + "\n" +
        "Jumlah Laboratorium: " + hitungJumlahLab() + "\n" +
        "  - Lab Komputer: " + hitungJumlahLabKomputer() + "\n" +
        "  - Lab Non-Komputer: " + hitungJumlahLabNonKomputer() + "\n" +
        "Jumlah Ruang Kantor Departemen: " + hitungJumlahRuangKantorDepartemen() + "\n" +
        "Jumlah Ruang Dosen: " + hitungJumlahRuangDosen();
  }
}