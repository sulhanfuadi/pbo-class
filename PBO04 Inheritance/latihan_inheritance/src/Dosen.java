/* Nama File : Dosen.java
  Deskripsi : Kelas Dosen merupakan kelas anak yang berisi atribut dan method yang digunakan oleh kelas anak
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
  protected String fakultas;

  // Constructor
  public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok);
    this.fakultas = fakultas;
  }

  // Metode untuk menampilkan informasi dosen, ditambahkan dengan fakultas
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fakultas   : " + fakultas);
  }
}
