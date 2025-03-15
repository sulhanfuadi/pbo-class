/* Nama File : Tendik.java
  Deskripsi : Kelas Tendik merupakan kelas anak yang berisi atribut dan method yang digunakan oleh kelas anak
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {
  private String bidang;
  private static final int BUP_USIA = 55;

  // Constructor
  public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok);
    this.bidang = bidang;

    // secuil tambahan: validate bidang,
    // bidang harus 'Akademik', 'Kemahasiswaan', atau 'Sumber Daya'
    if (!bidang.equals("Akademik") && !bidang.equals("Kemahasiswaan") && !bidang.equals("Sumber Daya")) {
      throw new IllegalArgumentException("Bidang harus 'Akademik', 'Kemahasiswaan', atau 'Sumber Daya'");
    }
  }

  // Metode untuk menghitung BUP (Batas Usia Pensiun)
  private LocalDate hitungBUP() {
    LocalDate bupDate = tanggalLahir.plusYears(BUP_USIA);
    return LocalDate.of(bupDate.getYear(), bupDate.getMonth().plus(1), 1);
  }

  // Metode untuk menghitung tunjangan
  private double hitungTunjangan() {
    // 1% x masa kerja (tahun) x gaji pokok
    return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
  }

  @Override
  public void printInfo() {
    System.out.println("NIP        : " + nip);
    System.out.println("Nama       : " + nama);
    System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
    System.out.println("TMT        : " + formatDate(tmt));
    System.out.println("Jabatan    : Tendik");
    System.out.println("Bidang     : " + bidang);
    System.out.println("Masa Kerja : " + formatMasaKerja(hitungMasaKerja()));
    System.out.println("BUP        : " + formatDate(hitungBUP()));
    System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));

    double tunjangan = hitungTunjangan();
    System.out.println("Tunjangan  : 1% x " + hitungMasaKerja().getYears() + " x Rp " +
        String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
  }
}
