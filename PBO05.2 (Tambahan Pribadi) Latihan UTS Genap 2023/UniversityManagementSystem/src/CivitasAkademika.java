public abstract class CivitasAkademika {
  private String nama;
  private String email;
  protected static int counter = 0; // Counter untuk menghitung jumlah instance

  protected CivitasAkademika(String nama, String email) {
    this.nama = nama;
    this.email = email;
    counter++; // Menambah counter setiap kali instance dibuat
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public static int getCounter() {
    return counter;
  }

  // Method abstract yang akan diimplementasikan di subclass
  public abstract void tampilkanInfo();
}