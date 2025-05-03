/* Nama File : RuangFakultas.java
  Deskripsi : Kelas abstrak untuk ruang milik fakultas
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public abstract class RuangFakultas extends Ruang {
  private static double tarifBiayaKebersihan; // tarif kebersihan yang sama untuk semua ruang fakultas

  public RuangFakultas(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
    super(kode, panjang, lebar, tinggi, kapasitas);
  }

  // Setter statis untuk mengatur tarif bagi semua ruang fakultas
  public static void setTarifBiayaKebersihan(double tarif) {
    tarifBiayaKebersihan = tarif;
  }

  public static double getTarifBiayaKebersihan() {
    return tarifBiayaKebersihan;
  }

  // Implementasi method hitungBiayaKebersihan dari kelas Ruang
  @Override
  public double hitungBiayaKebersihan() {
    // Biaya kebersihan = luas x tarif
    return hitungLuas() * tarifBiayaKebersihan;
  }
}