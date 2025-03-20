/* Nama File : PNS.java
  Deskripsi : Kelas PNS merupakan subclass dari kelas Manusia dan mengimplementasi interface Pajak.
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Maret 2025
*/

import java.util.Date;
import java.util.Calendar;

public class PNS extends Manusia implements Pajak {
  private String nip;
  private static int counterPns = 0;

  // Konstruktor tanpa parameter
  public PNS() {
    this.nip = "Belum diisi";
    counterPns++;
  }

  // Konstruktor dengan parameter
  public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.nip = nip;
    counterPns++;
  }

  // Konstruktor dengan 4 parameter (tanpa alamat)
  public PNS(String nama, Date tgl_mulai_kerja, double pendapatan, String nip) {
    // Memanggil konstruktor parent dengan nilai default untuk alamat
    super(nama, tgl_mulai_kerja, "Belum diisi", pendapatan);
    this.nip = nip;
    counterPns++;
  }

  @Override
  public double hitungPajak() {
    return 0.10 * getPendapatan(); // 10% dari pendapatan
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    // Add A (A = 5, diambil dari digit NIM ke-14)
    return years + 5;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("NIP: " + nip);
  }

  // Getters and setters
  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public static int getCounterPNS() {
    return counterPns;
  }
}