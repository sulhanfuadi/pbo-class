/* Nama File : Petani.java
  Deskripsi : Kelas Petani merupakan subclass dari kelas Manusia dan mengimplementasi interface Pajak.
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Maret 2025
*/

import java.util.Date;
import java.util.Calendar;

public class Petani extends Manusia implements Pajak {
  private String asal_daerah;
  private static int counterPetani = 0;

  // Konstruktor tanpa parameter
  public Petani() {
    this.asal_daerah = "Belum diisi";
    counterPetani++;
  }

  // Konstruktor dengan parameter
  public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_daerah) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.asal_daerah = asal_daerah;
    counterPetani++;
  }

  @Override
  public double hitungPajak() {
    return 0; // tidak ada pajak untuk petani
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    // Add C (C = 1, diambil dari digit NIM ke-12)
    return years + 1;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Asal Daerah: " + asal_daerah);
  }

  // Getters and setters
  public String getAsalDaerah() {
    return asal_daerah;
  }

  public void setAsalDaerah(String asal) {
    this.asal_daerah = asal;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }
}