public class TenagaKependidikan extends Karyawan {
  private static int counter = 0; // Counter khusus untuk tendik
  private static final double GAJI_POKOK = 4000000; // Gaji pokok tendik sesuai kasus

  public TenagaKependidikan(String nama, String email, String nip, int masaKerja) {
    super(nama, email, nip, masaKerja); // Memanggil konstruktor parent class
    counter++; // Menambah counter tendik
  }

  // Implementasi method hitungGaji untuk tendik
  @Override
  public double hitungGaji() {
    // Gaji tendik = 4.000.000 + (masa kerja × 1% × gaji pokok)
    return GAJI_POKOK + (getMasaKerja() * 0.01 * GAJI_POKOK);
  }

  // Override method dari class parent
  @Override
  public void tampilkanInfo() {
    System.out.println("=== Informasi Tenaga Kependidikan ===");
    System.out.println("Nama: " + getNama());
    System.out.println("Email: " + getEmail());
    System.out.println("NIP: " + getNip());
    System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
    System.out.println("Gaji: Rp" + String.format("%,.2f", hitungGaji()));
    System.out.println("=====================");
  }

  public static int getCounter() {
    return counter;
  }
}