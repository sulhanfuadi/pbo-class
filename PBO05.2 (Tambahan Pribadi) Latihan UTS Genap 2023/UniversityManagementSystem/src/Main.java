public class Main {
  public static void main(String[] args) {
    // Membuat Universitas
    Universitas univ = new Universitas("Universitas Teknologi Indonesia");

    // Membuat Fakultas
    Fakultas fti = new Fakultas("Fakultas Teknologi Informasi", 8000000, 7000000);
    Fakultas fek = new Fakultas("Fakultas Ekonomi dan Bisnis", 7500000, 6500000);

    // Menambahkan Fakultas ke Universitas
    univ.tambahFakultas(fti);
    univ.tambahFakultas(fek);

    // Membuat Mahasiswa
    Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "budi@mail.com", "12345", 1, fti);
    Mahasiswa mhs2 = new Mahasiswa("Ani Wulandari", "ani@mail.com", "12346", 3, fek);

    // Membuat Dosen
    Dosen dsn1 = new Dosen("Dr. Ahmad", "ahmad@mail.com", "D001", 5, fti);
    Dosen dsn2 = new Dosen("Prof. Maya", "maya@mail.com", "D002", 10, fek);

    // Membuat Tenaga Kependidikan
    TenagaKependidikan tnd1 = new TenagaKependidikan("Rudi", "rudi@mail.com", "T001", 7);

    // Menampilkan informasi
    System.out.println("Informasi Civitas Akademika:");
    System.out.println("============================");

    mhs1.tampilkanInfo();
    mhs2.tampilkanInfo();
    dsn1.tampilkanInfo();
    dsn2.tampilkanInfo();
    tnd1.tampilkanInfo();

    // Menampilkan jumlah instance
    System.out.println("\nJumlah Instance:");
    System.out.println("Total Civitas Akademika: " + CivitasAkademika.getCounter());
    System.out.println("Total Mahasiswa: " + Mahasiswa.getCounter());
    System.out.println("Total Karyawan: " + Karyawan.getCounter());
    System.out.println("Total Dosen: " + Dosen.getCounter());
    System.out.println("Total Tenaga Kependidikan: " + TenagaKependidikan.getCounter());
  }
}