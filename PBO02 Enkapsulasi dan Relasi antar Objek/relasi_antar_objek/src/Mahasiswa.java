/* Nama File : Mahasiswa.java
  Deskripsi : Berisi atribut dan method dalam class Mahasiswa
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Februari 2025
*/

import java.util.ArrayList;

public class Mahasiswa {
  /************** ATRIBUT **************/
  private String nim;
  private String nama;
  private String prodi;
  ArrayList<MataKuliah> listMatkul; // Atribut listMatkul bertipe ArrayList dari class MataKuliah
  private Dosen dosenWali;
  private Kendaraan kendaraan;

  /************** METHOD **************/
  // Konstruktor tanpa parameter
  public Mahasiswa() {
    this.nim = "";
    this.nama = "";
    this.prodi = "";
    this.listMatkul = new ArrayList<MataKuliah>();
    this.dosenWali = new Dosen();
    this.kendaraan = new Kendaraan();
  }

  // Konstruktor dengan parameter
  public Mahasiswa(String nim, String nama, String prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.listMatkul = new ArrayList<MataKuliah>();
    this.dosenWali = new Dosen();
    this.kendaraan = new Kendaraan();
  }

  // Selektor (getter)
  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public String getProdi() {
    return prodi;
  }

  public ArrayList<MataKuliah> getListMatkul() {
    return listMatkul;
  }

  public Dosen getDosenWali() {
    return dosenWali;
  }

  public Kendaraan getKendaraan() {
    return kendaraan;
  }

  // Mutator (setter)
  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
    this.listMatkul = listMatkul;
  }

  public void setDosenWali(Dosen dosenWali) {
    this.dosenWali = dosenWali;
  }

  public void setKendaraan(Kendaraan kendaraan) {
    this.kendaraan = kendaraan;
  }

  // Method addMatKul() untuk mendambahkan
  // sebuah mata kuliah ke atribut listMatKul.
  public void addMatKul(MataKuliah matkul) {
    listMatkul.add(matkul);
    // add() adalah method yang dimiliki oleh
    // ArrayList untuk menambahkan elemen baru
    // ke dalam ArrayList.
  }

  // Method getJumlahSKS() untuk
  // mendapatkan jumlah SKS mata kuliah yang
  // diambil mahasiswa.
  public int getJumlahSKS() {
    int totalSks = 0;
    // Looping untuk menghitung total SKS
    for (MataKuliah matkul : listMatkul) {
      totalSks += matkul.getSks();
    }
    return totalSks;
  }

  // Method getJumlahMatKul() untuk
  // mendapatkan jumlah mata kuliah yang
  // diambil mahasiswa.
  public int getJumlahMatKul() {
    return listMatkul.size();
    // size() adalah method yang dimiliki
    // oleh ArrayList untuk mendapatkan
    // jumlah elemen yang ada di dalamnya.
  }

  // Method printMhs() untuk menampilkan
  // nim, nama, dan prodi mahasiswa.
  public void printMhs() {
    System.out.println("NIM : " + nim);
    System.out.println("Nama : " + nama);
    System.out.println("Prodi : " + prodi);
  }

  // Method printDetailMhs() untuk
  // menampilkan nim, nama, prodi, daftar mata
  // kuliah yang diambil, data dosen wali, serta
  // data kendaraan yang dimiliki mahasiswa.
  public void printDetailMhs() {
    printMhs();
    // Memanggil method printMhs() dari class Mahasiswa
    // untuk menampilkan nim, nama, dan prodi mahasiswa.
    System.out.println("Daftar Mata Kuliah : ");
    for (MataKuliah matkul : listMatkul) {
      System.out.println("  - " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
      // getNama() dan getSks() adalah method yang dimiliki
      // oleh class MataKuliah untuk mendapatkan detail data mata kuliah
    }
    System.out.println("Dosen Wali : ");
    System.out.println("  - NIP : " + dosenWali.getNip());
    System.out.println("  - Nama : " + dosenWali.getNama());
    System.out.println("  - Prodi : " + dosenWali.getProdi());
    // getNip(), getNama(), dan getProdi() adalah method yang
    // dimiliki oleh class Dosen untuk mendapatkan data dosen wali
    System.out.println("Kendaraan : ");
    System.out.println("  - No. Plat : " + kendaraan.getNoPlat());
    System.out.println("  - Jenis : " + kendaraan.getJenis());
    // getNoPlat() dan getJenis() adalah method yang dimiliki
    // oleh class Kendaraan untuk mendapatkan data kendaraan
    // yang dimiliki mahasiswa
  }
}
