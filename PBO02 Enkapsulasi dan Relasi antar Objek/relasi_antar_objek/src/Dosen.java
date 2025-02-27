/* Nama File : Dosen.java
  Deskripsi : Berisi atribut dan method dalam class Dosen
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Februari 2025
*/

public class Dosen {
  /************** ATRIBUT **************/
  private String nip;
  private String nama;
  private String prodi;

  /************** METHOD **************/
  // Konstruktor tanpa parameter
  public Dosen() {
    this.nip = "";
    this.nama = "";
    this.prodi = "";
  }

  // Konstruktor dengan parameter nip, nama, dan prodi
  public Dosen(String nip, String nama, String prodi) {
    this.nip = nip;
    this.nama = nama;
    this.prodi = prodi;
  }

  // Selektor (getter)
  public String getNip() {
    return nip;
  }

  public String getNama() {
    return nama;
  }

  public String getProdi() {
    return prodi;
  }

  // Mutator (setter)
  public void setNip(String nip) {
    this.nip = nip;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }
}
