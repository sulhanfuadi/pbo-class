/* Nama File : DosenTetap.java
  Deskripsi : Kelas DosenTetap merupakan kelas anak yang berisi atribut dan method yang digunakan oleh kelas anak
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen {
  private String nidn;
  private static final int BUP_USIA = 65;

  // Constructor
  public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
      String fakultas, String nidn) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
    this.nidn = nidn;
  }

  // Metode untuk menghitung BUP (Batas Usia Pensiun)
  private LocalDate hitungBUP() {
    // BUP = tanggal lahir + 65 tahun (tanggal 1 bulan berikutnya setelah tanggal
    // lahir + 65 tahun)
    LocalDate bupDate = tanggalLahir.plusYears(BUP_USIA); // Tambah 65 tahun
    return LocalDate.of(bupDate.getYear(), bupDate.getMonth().plus(1), 1); // Tambah 1 bulan
  }

  // Metode untuk menghitung tunjangan
  private double hitungTunjangan() {
    // 2% x masa kerja (tahun) x gaji pokok
    return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
  }

  @Override
  public void printInfo() {
    System.out.println("NIP        : " + nip);
    System.out.println("NIDN       : " + nidn);
    System.out.println("Nama       : " + nama);
    System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
    System.out.println("TMT        : " + formatDate(tmt));
    System.out.println("Jabatan    : Dosen Tetap");
    System.out.println("Fakultas   : " + fakultas);
    System.out.println("Masa Kerja : " + formatMasaKerja(hitungMasaKerja()));
    System.out.println("BUP        : " + formatDate(hitungBUP()));
    System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));

    double tunjangan = hitungTunjangan();
    System.out.println("Tunjangan  : 2% x " + hitungMasaKerja().getYears() + " x Rp " +
        String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
  }
}
