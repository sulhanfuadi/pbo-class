/* Nama File : DosenTamu.java
  Deskripsi : Kelas DosenTamu merupakan kelas anak yang berisi atribut dan method yang digunakan oleh kelas anak
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
  private String nidk;
  private LocalDate tanggalBerakhirKontrak;

  // Constructor
  public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
      String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
    this.nidk = nidk;
    this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
  }

  // Metode untuk menghitung masa kontrak tersisa
  private Period hitungMasaKontrakTersisa() {
    LocalDate today = LocalDate.now();
    return Period.between(today, tanggalBerakhirKontrak);
  }

  // Metode untuk menghitung tunjangan
  private double hitungTunjangan() {
    // 2.5% x gaji pokok
    return 0.025 * gajiPokok;
  }

  @Override
  public void printInfo() {
    System.out.println("NIP        : " + nip);
    System.out.println("NIDK       : " + nidk);
    System.out.println("Nama       : " + nama);
    System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
    System.out.println("TMT        : " + formatDate(tmt));
    System.out.println("Jabatan    : Dosen Tamu");
    System.out.println("Fakultas   : " + fakultas);
    System.out.println("Masa Kerja : " + formatMasaKerja(hitungMasaKerja()));

    Period kontrakTersisa = hitungMasaKontrakTersisa();
    System.out.println("Masa Kontrak Tersisa : " + kontrakTersisa.getYears() + " tahun " +
        kontrakTersisa.getMonths() + " bulan");
    System.out.println("Berakhir Kontrak : " + formatDate(tanggalBerakhirKontrak));
    System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));

    double tunjangan = hitungTunjangan();
    System.out.println("Tunjangan  : 2.5% x Rp " + String.format("%,.2f", gajiPokok) +
        " = Rp " + String.format("%,.2f", tunjangan));
  }
}
