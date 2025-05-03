/* Nama File : RuangDepartemen.java
  Deskripsi : Kelas untuk ruang yang dimiliki departemen
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public abstract class RuangDepartemen extends Ruang {
  private Departemen departemen; // Asosiasi dengan departemen

  public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      Departemen departemen) {
    super(kode, panjang, lebar, tinggi, kapasitas);
    this.departemen = departemen;
  }

  public Departemen getDepartemen() {
    return departemen;
  }

  // Implementasi method hitungBiayaKebersihan dari kelas Ruang
  @Override
  public double hitungBiayaKebersihan() {
    // Biaya kebersihan = luas x tarif departemen
    return hitungLuas() * departemen.getTarifBiayaKebersihan();
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return super.tampilkanInfo() +
        "\nDepartemen: " + departemen.getNama() +
        "\nBiaya Kebersihan: Rp. " + hitungBiayaKebersihan();
  }
}