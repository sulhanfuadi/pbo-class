public class Mahasiswa extends CivitasAkademika {
  private String nim;
  private int semester;
  private Fakultas fakultas;
  private static int counter = 0; // Counter khusus untuk mahasiswa

  public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
    super(nama, email); // Memanggil konstruktor parent class
    this.nim = nim;
    this.semester = semester;
    this.fakultas = fakultas;
    counter++; // Menambah counter mahasiswa
  }

  public String getNim() {
    return nim;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public Fakultas getFakultas() {
    return fakultas;
  }

  public void setFakultas(Fakultas fakultas) {
    this.fakultas = fakultas;
  }

  // Method untuk menghitung UKT dengan pengurangan 5% per semester
  public double hitungUKT() {
    // UKT berkurang 5% setiap semesternya
    double potongan = (semester - 1) * 0.05;
    // Pastikan potongan tidak melebihi 100%
    potongan = Math.min(potongan, 1.0);
    return fakultas.getTarifUKT() * (1 - potongan);
  }

  // Override method dari class parent
  @Override
  public void tampilkanInfo() {
    System.out.println("=== Informasi Mahasiswa ===");
    System.out.println("Nama: " + getNama());
    System.out.println("Email: " + getEmail());
    System.out.println("NIM: " + nim);
    System.out.println("Semester: " + semester);
    System.out.println("Fakultas: " + fakultas.getNama());
    System.out.println("UKT: Rp" + String.format("%,.2f", hitungUKT()));
    System.out.println("=====================");
  }

  public static int getCounter() {
    return counter;
  }
}