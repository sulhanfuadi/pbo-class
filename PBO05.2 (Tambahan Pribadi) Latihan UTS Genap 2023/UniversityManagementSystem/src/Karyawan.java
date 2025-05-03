public abstract class Karyawan extends CivitasAkademika {
  private String nip;
  private int masaKerja;
  private static int counter = 0; // Counter khusus untuk karyawan

  protected Karyawan(String nama, String email, String nip, int masaKerja) {
    super(nama, email); // Memanggil konstruktor parent class
    this.nip = nip;
    this.masaKerja = masaKerja;
    counter++; // Menambah counter karyawan
  }

  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public int getMasaKerja() {
    return masaKerja;
  }

  public void setMasaKerja(int masaKerja) {
    this.masaKerja = masaKerja;
  }

  // Method abstract untuk menghitung gaji yang akan diimplementasikan di subclass
  public abstract double hitungGaji();

  public static int getCounter() {
    return counter;
  }
}