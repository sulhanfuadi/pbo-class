/* Nama File : Main.java
  Deskripsi : Kelas utama untuk demonstrasi program
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Maret 2025
*/

public class Main {
  public static void main(String[] args) {
    // Inisialisasi tarif kebersihan untuk ruang fakultas
    RuangFakultas.setTarifBiayaKebersihan(5000); // Rp 5000 per meter persegi

    // Membuat beberapa departemen
    Departemen informatika = new Departemen("Informatika", "Dr. Aris Sugiharto, S.Si., M.Kom.", 4500);
    Departemen matematika = new Departemen("Matematika", "Dr. Susilo Hariyanto, S.Si, M.Si", 4000);
    Departemen biologi = new Departemen("Biologi", "Prof. Drs. Sapto Purnomo Putro, M.Si., Ph.D.", 4200);

    // Inisialisasi counter untuk statistik
    RuangCounter counter = new RuangCounter();

    // Membuat ruang kelas
    RuangKelas kelas1 = new RuangKelas("K-101", 10, 8, 3.5, 40, 38, 2);
    RuangKelas kelas2 = new RuangKelas("K-102", 12, 10, 3.5, 60, 55, 5);

    // Membuat lab komputer
    LabKomputer labKom1 = new LabKomputer("LK-201", 15, 10, 3, 30, "Laboratorium Pemrograman", 500000, 30);
    LabKomputer labKom2 = new LabKomputer("LK-202", 12, 8, 3, 25, "Laboratorium Jaringan", 450000, 25);

    // Membuat lab non-komputer
    LabNonKomputer labBio = new LabNonKomputer("LB-301", 14, 12, 3, 25, "Laboratorium Mikrobiologi", 600000, "Biologi");
    LabNonKomputer labFis = new LabNonKomputer("LF-302", 12, 10, 3, 20, "Laboratorium Fisika Dasar", 550000, "Fisika");

    // Menambahkan mata kuliah yang ditangani lab
    labBio.tambahMataKuliah("Biologi Sel");
    labBio.tambahMataKuliah("Mikrobiologi Dasar");
    labBio.tambahMataKuliah("Genetika");

    labFis.tambahMataKuliah("Fisika Dasar I");
    labFis.tambahMataKuliah("Fisika Dasar II");
    labFis.tambahMataKuliah("Pengukuran Fisika");

    // Membuat ruang kantor departemen
    RuangKantorDepartemen kantorIF = new RuangKantorDepartemen("KD-101", 8, 6, 3, 10,
        informatika, 5, 12, 8);
    RuangKantorDepartemen kantorMTK = new RuangKantorDepartemen("KD-102", 7, 5, 3, 8,
        matematika, 4, 10, 6);
    RuangKantorDepartemen kantorBIO = new RuangKantorDepartemen("KD-103", 8, 6, 3, 10,
        biologi, 5, 12, 8);

    // Membuat ruang dosen
    RuangDosen dosenA = new RuangDosen("D-201", 4, 3, 3, 3,
        informatika, "Dr. Eng. Adi Wibowo, S.Si., M.Kom.", 2, 4);
    RuangDosen dosenB = new RuangDosen("D-202", 3.5, 3, 3, 2,
        matematika, "Dr.Dra. Titi Udjiani S.R.R.M., M.Si.", 1, 3);
    RuangDosen dosenC = new RuangDosen("D-203", 4, 3, 3, 3,
        biologi, "Prof. Drs. Sapto Purnomo Putro, M.Si., Ph.D.", 2, 4);

    // Menambahkan semua ruang ke counter
    counter.tambahRuang(kelas1);
    counter.tambahRuang(kelas2);
    counter.tambahRuang(labKom1);
    counter.tambahRuang(labKom2);
    counter.tambahRuang(kantorIF);
    counter.tambahRuang(kantorMTK);
    counter.tambahRuang(kantorBIO);
    counter.tambahRuang(dosenA);
    counter.tambahRuang(dosenB);
    counter.tambahRuang(dosenC);

    // Menampilkan informasi contoh ruangan
    System.out.println("---------- CONTOH INFORMASI RUANGAN ----------");
    System.out.println(kelas1.tampilkanInfo());
    System.out.println("\n" + labKom1.tampilkanInfo());
    System.out.println("\n" + labBio.tampilkanInfo());
    System.out.println("\n" + kantorIF.tampilkanInfo());
    System.out.println("\n" + dosenA.tampilkanInfo());

    // Menampilkan statistik ruangan
    System.out.println("\n\n---------- STATISTIK RUANGAN ----------");
    System.out.println(counter.tampilkanStatistik());

    // Menampilkan biaya kebersihan per bulan
    System.out.println("\n---------- BIAYA KEBERSIHAN BULANAN ----------");

    // Demonstrasi overloading dengan method hitungTotalBiayaKebersihan
    double totalBiayaFakultas = hitungTotalBiayaKebersihan(kelas1, kelas2, labKom1, labKom2, labBio, labFis);
    double totalBiayaDepartemen = hitungTotalBiayaKebersihan(kantorIF, kantorMTK, kantorBIO, dosenA, dosenB, dosenC);

    System.out.println("Total Biaya Kebersihan Ruang Fakultas: Rp. " + totalBiayaFakultas);
    System.out.println("Total Biaya Kebersihan Ruang Departemen: Rp. " + totalBiayaDepartemen);
    System.out.println("Total Biaya Kebersihan Keseluruhan: Rp. " + (totalBiayaFakultas + totalBiayaDepartemen));
  }

  // Contoh metode overloading untuk menghitung total biaya kebersihan
  // Overloading 1: Untuk ruang fakultas
  public static double hitungTotalBiayaKebersihan(RuangFakultas... ruangs) {
    double total = 0;
    for (RuangFakultas ruang : ruangs) {
      total += ruang.hitungBiayaKebersihan();
    }
    return total;
  }

  // Overloading 2: Untuk ruang departemen
  public static double hitungTotalBiayaKebersihan(RuangDepartemen... ruangs) {
    double total = 0;
    for (RuangDepartemen ruang : ruangs) {
      total += ruang.hitungBiayaKebersihan();
    }
    return total;
  }
}
