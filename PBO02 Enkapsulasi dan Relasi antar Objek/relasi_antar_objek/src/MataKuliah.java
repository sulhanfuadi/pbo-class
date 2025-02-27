/* Nama File : MataKuliah.java
  Deskripsi : Berisi atribut dan method dalam class MataKuliah
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Februari 2025
*/

public class MataKuliah {
  /************** ATRIBUT **************/
  private String idMatKul;
  private String nama;
  private int sks;

  /************** METHOD **************/
  // Konstruktor tanpa parameter
  public MataKuliah() {
    this.idMatKul = "";
    this.nama = "";
    this.sks = 0;
  }

  // Konstruktor dengan parameter
  public MataKuliah(String idMatKul, String nama, int sks) {
    this.idMatKul = idMatKul;
    this.nama = nama;
    this.sks = sks;
  }

  // Selektor (getter)
  public String getIdMatKul() {
    return idMatKul;
  }

  public String getNama() {
    return nama;
  }

  public int getSks() {
    return sks;
  }

  // Mutator (setter)
  public void setIdMatKul(String idMatKul) {
    this.idMatKul = idMatKul;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }
}
