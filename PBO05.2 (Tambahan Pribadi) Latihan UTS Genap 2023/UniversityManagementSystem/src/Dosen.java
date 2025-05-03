public class Dosen extends Karyawan {
  private Fakultas fakultas;
  private static int counter = 0; // Counter khusus untuk dosen

  public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
    super(nama, email, nip, masaKerja); // Memanggil konstruktor parent class
    this.fakultas = fakultas;
    counter++; // Menambah counter dosen
  }

  public Fakultas getFakultas() {
    return fakultas;
  }

  public void setFakultas(Fakultas fakultas) {
    this.fakultas = fakultas;
  }

  // Implementasi method hitungGaji untuk dosen
  @Override
  public double hitungGaji() {
    double gajiPokok = fakultas.getGajiPokok();
    // Gaji dosen = gaji pokok fakultas + (masa kerja × 1% × gaji pokok)
    return gajiPokok + (getMasaKerja() * 0.01 * gajiPokok);
  }

  // Override method dari class parent
  @Override
  public void tampilkanInfo() {
    System.out.println("=== Informasi Dosen ===");
    System.out.println("Nama: " + getNama());
    System.out.println("Email: " + getEmail());
    System.out.println("NIP: " + getNip());
    System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
    System.out.println("Fakultas: " + fakultas.getNama());
    System.out.println("Gaji: Rp" + String.format("%,.2f", hitungGaji()));
    System.out.println("=====================");
  }

  public static int getCounter() {
    return counter;
  }
}