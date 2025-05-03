/* Nama File : RuangDosen.java
  Deskripsi : Kelas untuk ruang dosen
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class RuangDosen extends RuangDepartemen {
  private String namaDosen;
  private int jumlahMeja;
  private int jumlahKursi;

  // Konstruktor
  public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
      Departemen departemen, String namaDosen, int jumlahMeja, int jumlahKursi) {
    super(kode, panjang, lebar, tinggi, kapasitas, departemen);
    this.namaDosen = namaDosen;
    this.jumlahMeja = jumlahMeja;
    this.jumlahKursi = jumlahKursi;
  }

  // Getter dan setter
  public String getNamaDosen() {
    return namaDosen;
  }

  public int getJumlahMeja() {
    return jumlahMeja;
  }

  public int getJumlahKursi() {
    return jumlahKursi;
  }

  // Override method tampilkanInfo
  @Override
  public String tampilkanInfo() {
    return "=== RUANG DOSEN ===\n" +
        super.tampilkanInfo() +
        "\nNama Dosen: " + namaDosen +
        "\nJumlah Meja: " + jumlahMeja +
        "\nJumlah Kursi: " + jumlahKursi;
  }
}