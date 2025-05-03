/*
 * Nama File  : Anabul.java
 * Deskripsi   : Superclass abstrak Anabul dengan atribut, konstruktor,
 *               selektor, mutator, abstract methods, dan fitur tambahan
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 27 April 2025
*/

public abstract class Anabul {
  // atribut
  protected String nama;
  protected int umur;
  protected String jenisKelamin;
  protected String warna;

  // Konstruktor
  public Anabul(String nama, int umur, String jenisKelamin, String warna) {
    this.nama = nama;
    this.umur = umur;
    this.jenisKelamin = jenisKelamin;
    this.warna = warna;
  }

  // Selektor (getter)
  public String getNama() {
    return nama;
  }

  public int getUmur() {
    return umur;
  }

  public String getJenisKelamin() {
    return jenisKelamin;
  }

  public String getWarna() {
    return warna;
  }

  // Mutator (setter)
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setUmur(int umur) {
    this.umur = umur;
  }

  public void setJenisKelamin(String jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  // Abstract methods
  public abstract void gerak();

  public abstract void bersuara();

  // Metode tambahan
  public void makan() {
    System.out.println(nama + " sedang makan.");
  }

  public void tidur() {
    System.out.println(nama + " sedang tidur.");
  }

  public void info() {
    System.out.printf(
        "Info %s -> umur: %d tahun, jenis kelamin: %s, warna: %s%n",
        nama, umur, jenisKelamin, warna);
  }
}
