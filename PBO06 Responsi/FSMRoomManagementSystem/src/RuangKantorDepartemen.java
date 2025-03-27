/* Nama File : RuangKantorDepartemen.java
  Deskripsi : Kelas untuk ruang kantor departemen
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class RuangKantorDepartemen extends RuangDepartemen {
  private int jumlahMeja;
  private int jumlahKursi;
  private int jumlahLemari;

  // Konstruktor
  public RuangKantorDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
    super(kode, panjang, lebar, tinggi, kapasitas, departemen);
    this.jumlahMeja = jumlahMeja;
    this.jumlahKursi = jumlahKursi;
    this.jumlahLemari = jumlahLemari;
  }

  // Getter dan setter
  public int getJumlahMeja() {
    return jumlahMeja;
  }

  public int getJumlahKursi() {
    return jumlahKursi;
  }

  public int getJumlahLemari() {
    return jumlahLemari;
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return "=== RUANG KANTOR DEPARTEMEN ===\n" +
        super.tampilkanInfo() +
        "\nJumlah Meja: " + jumlahMeja +
        "\nJumlah Kursi: " + jumlahKursi +
        "\nJumlah Lemari: " + jumlahLemari;
  }
}