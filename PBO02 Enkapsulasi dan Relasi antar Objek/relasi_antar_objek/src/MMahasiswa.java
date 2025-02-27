/* Nama File : MMahasiswa.java
  Deskripsi : Uji coba fungsi dan manipulasi objek dari berbagai kelas yang terlibat dalam relasi antar objek
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Februari 2025
*/

public class MMahasiswa {
  public static void main(String[] args) {
    // Membuat objek MataKuliah
    MataKuliah mk1 = new MataKuliah("IF2123", "Pemrograman Berorientasi Objek", 3);
    MataKuliah mk2 = new MataKuliah("IF2124", "Struktur Data", 4);
    MataKuliah mk3 = new MataKuliah("IF2125", "Basis Data", 3);

    // Membuat objek Dosen
    Dosen dosen1 = new Dosen("198009142006041002", "Edy Suharto, S.T., M.Kom", "Informatika");

    // Membuat objek Kendaraan
    Kendaraan kendaraan1 = new Kendaraan("AA 1234 ABC", "Mobil");

    // Membuat objek Mahasiswa
    Mahasiswa mhs1 = new Mahasiswa("24060123130115", "Sulhan Fuadi", "Informatika");

    // Relasikan mahasiswa dengan objek lainnya
    mhs1.setDosenWali(dosen1);
    mhs1.setKendaraan(kendaraan1);
    mhs1.addMatKul(mk1);
    mhs1.addMatKul(mk2);
    mhs1.addMatKul(mk3);

    // Membuat objek mahasiswa kedua dengan relasi berbeda
    Mahasiswa mhs2 = new Mahasiswa("24060123130116", "Rodion Raskolnikov", "Informatika");
    Dosen dosen2 = new Dosen("198903032015042002", "Khadijah, S.Kom., M.Cs.", "Informatika");
    Kendaraan kendaraan2 = new Kendaraan("H 5678 DEF", "Motor");

    mhs2.setDosenWali(dosen2);
    mhs2.setKendaraan(kendaraan2);
    mhs2.addMatKul(mk1);
    mhs2.addMatKul(mk3);

    // Memanggil method dari objek mahasiswa
    System.out.println("=== INFORMASI MAHASISWA 1 ===");
    System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());
    System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());
    System.out.println("\nDetail Mahasiswa:");
    mhs1.printDetailMhs();

    System.out.println("\n=== INFORMASI MAHASISWA 2 ===");
    System.out.println("Jumlah SKS: " + mhs2.getJumlahSKS());
    System.out.println("Jumlah Mata Kuliah: " + mhs2.getJumlahMatKul());
    System.out.println("\nDetail Mahasiswa:");
    mhs2.printDetailMhs();
  }
}
